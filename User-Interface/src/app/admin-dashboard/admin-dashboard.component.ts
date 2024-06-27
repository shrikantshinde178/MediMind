import { Component, OnInit } from '@angular/core';
// import { GoogleMapsModule } from '@angular/google-maps'
import { DataService } from '../data.service'
import { Patient } from '../patient.model';
import { ColDef } from 'ag-grid-community';
import * as FileSaver from 'file-saver';
import { PatientService } from '../patient.service';


@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrl: './admin-dashboard.component.css'
})
export class AdminDashboardComponent implements OnInit {


  rowData: any;

  colDefs: ColDef[] = [
    { field: 'NAME', headerName: 'NAME' },
    { field: 'EMAILID', headerName: 'EMAIL' },
    { field: 'MOBILE', headerName: 'Mobile' },
    { field: 'AGE', headerName: 'Age' },
    { field: 'ADMITTEDDATE', headerName: 'Admitted Date' },
    { field: 'UID', headerName: 'UID' },
    { field: 'ADDRESS', headerName: 'Address' },
    { field: 'PINCODE', headerName: 'Pincode' }
  ];

  constructor(private dat:DataService, private patientService: PatientService){

  }

  ngOnInit(): void {

  this.dat.descdata().subscribe(data => {
      this.rowData = data;
      console.log(this.rowData);
    });
  }

  send_sms(){
    this.dat.sendsms().subscribe();
  }

}
