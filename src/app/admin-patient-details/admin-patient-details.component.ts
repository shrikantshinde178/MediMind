import { Component, OnInit } from '@angular/core';
import { PatientService } from '../patient.service';
import { Patient } from '../patient.model';
import { ColDef } from 'ag-grid-community';
import * as FileSaver from 'file-saver';


@Component({
  selector: 'app-admin-patient-details',
  templateUrl: './admin-patient-details.component.html',
  styleUrls: ['./admin-patient-details.component.css']
})

export class AdminPatientDetailsComponent implements OnInit {
  rowData: Patient[] = [];
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

  constructor(private patientService: PatientService) { }

  ngOnInit(): void {
    this.patientService.getPatients().subscribe(data => {
      this.rowData = data;
      console.log(this.rowData)
    });
  }

  downloadPatients(): void {
    const patientsCSV = this.convertToCSV(this.rowData);
    const blob = new Blob([patientsCSV], { type: 'text/csv;charset=utf-8' });
    FileSaver.saveAs(blob, 'patients.csv');
  }

  convertToCSV(data: any[]): string {
    const header = Object.keys(data[0]).join(',');
    const rows = data.map(patient => Object.values(patient).join(','));
    return `${header}\n${rows.join('\n')}`;
  }
}
