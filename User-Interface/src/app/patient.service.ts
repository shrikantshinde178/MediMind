import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Patient } from './patient.model'; 
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  private apiUrl = 'http://localhost:5000/alldata'; 
  constructor(private http: HttpClient) { }
  getPatients(): Observable<Patient[]> {
    return this.http.get<Patient[]>(this.apiUrl);
  }

  // constructor(private http: HttpClient) { }
  // getPatients(): Observable<Patient[]> {
  //   const patients: Patient[] = [
  //     new Patient(1, 'John Doe', 'john.doe@example.com', 1234, '1234567890', 30, '2023-01-01', 123456, '123 Street Name'),
  //     new Patient(2, 'Kute Kelp', 'kute.kelp@example.com', 2222, '876998890', 21, '2024-06-07', 879677, 'Stallin, Estonia')
  //     // Add more patients as needed
  //   ];
  //   return of(patients);
  // }

}
