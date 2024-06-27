import { Component, OnInit } from '@angular/core';
import * as L from 'leaflet';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  private map!: L.Map;

  constructor() { }

  ngOnInit(): void {
    this.initMap();
  }

  private initMap(): void {
    this.map = L.map('map', {
      center: [51.505, -0.09], // Default center (London)
      zoom: 13
    });

    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    }).addTo(this.map);

    // Get the user's current location
    navigator.geolocation.getCurrentPosition(
      (position) => {
        const userLocation: [number, number] = [position.coords.latitude, position.coords.longitude];
        console.log('User location:', userLocation); // Debugging log
        this.map.setView(userLocation, 14);

        // Add a marker for the user's location with a custom icon
        const userIcon = L.icon({
          iconUrl: 'assets/userlocation.png',
          iconSize: [55, 60],
          iconAnchor: [12, 41],
          popupAnchor: [1, -34],
          shadowUrl: 'assets/markers/marker-shadow.png',
          shadowSize: [41, 41],
          shadowAnchor: [12, 41]
        });

        L.marker(userLocation, { icon: userIcon }).addTo(this.map).bindPopup("You are here").openPopup();

        // Fetch nearby medical stores using Overpass API
        fetch(`https://overpass-api.de/api/interpreter?data=[out:json];node[amenity=pharmacy](around:5000,${position.coords.latitude},${position.coords.longitude});out;`)
          .then(response => response.json())
          .then(data => {
            console.log('Pharmacies data:', data); // Debugging log
            // Calculate the distance of each pharmacy from the user's location
            const distances = data.elements.map((element: any) => ({
              ...element,
              distance: this.calculateDistance(userLocation, [element.lat, element.lon])
            }));

            // Find the nearest pharmacy
            const nearestPharmacy = distances.reduce((prev: { distance: number; }, curr: { distance: number; }) => prev.distance < curr.distance ? prev : curr);

            // Add markers for all pharmacies with different colors based on distance
            distances.forEach((element: any) => {
              const storeLocation: [number, number] = [element.lat, element.lon];
              const iconColor = this.getColorBasedOnDistance(element.distance);
              const icon = this.getIconBasedOnColor(iconColor);
              const popupClass = this.getPopupClassBasedOnDistance(element.distance);
              
              const marker = L.marker(storeLocation, { icon: icon })
                .addTo(this.map)
                .bindPopup(`<div class="${popupClass} ${element.id === nearestPharmacy.id ? 'highlight-popup' : ''}">${element.tags.name || 'Pharmacy'}</div>`, { className: popupClass });

              // Apply continuous hover effect for the nearest pharmacy
              if (element.id === nearestPharmacy.id) {
                marker.openPopup();
              }
            });
          })
          .catch(error => {
            console.error('Error fetching pharmacies:', error); // Debugging log
          });
      },
      (error) => {
        console.error('Error getting location', error); // Debugging log
      },
      {
        enableHighAccuracy: true, // Use high accuracy for better results
        timeout: 5000, // Timeout after 5 seconds
        maximumAge: 0 // Do not use cached location
      }
    );
  }

  // Create icon based on color
  private getIconBasedOnColor(color: string): L.Icon {
    const colorMap: { [key: string]: string } = {
      red: 'red',
      darkgreen: 'green',
      lightgreen: 'lightgreen',
      lightestgreen: 'lightestgreen',
      highlight: 'yellow' // Add a highlight color
    };

    return L.icon({
      iconUrl: `assets/newIcon.png`,
      iconSize: [25, 41],
      iconAnchor: [12, 41],
      popupAnchor: [1, -34],
      shadowUrl: 'assets/markers/marker-shadow.png',
      shadowSize: [41, 41],
      shadowAnchor: [12, 41]
    });
  }

  // Return color based on distance
  private getColorBasedOnDistance(distance: number): string {
    if (distance < 1) {
      return 'darkgreen'; // Dark green for nearest pharmacies
    } else if (distance < 3) {
      return 'lightgreen'; // Light green for mid-distance pharmacies
    } else {
      return 'lightestgreen'; // Lightest green for far pharmacies
    }
  }

  // Return a CSS class based on distance
  private getPopupClassBasedOnDistance(distance: number): string {
    if (distance < 1) {
      return 'popup-near';
    } else if (distance < 3) {
      return 'popup-mid';
    } else {
      return 'popup-far';
    }
  }

  // Calculate the distance between two coordinates using the Haversine formula
  private calculateDistance(coord1: [number, number], coord2: [number, number]): number {
    const toRad = (value: number) => value * Math.PI / 180;
    const R = 6371; // Radius of the Earth in km
    const dLat = toRad(coord2[0] - coord1[0]);
    const dLon = toRad(coord2[1] - coord1[1]);
    const lat1 = toRad(coord1[0]);
    const lat2 = toRad(coord2[0]);

    const a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
      Math.sin(dLon / 2) * Math.sin(dLon / 2) * Math.cos(lat1) * Math.cos(lat2);
    const c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    return R * c; // Distance in km
  }
}
