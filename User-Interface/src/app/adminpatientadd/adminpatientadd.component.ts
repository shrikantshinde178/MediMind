import { Component, TemplateRef, OnInit, AfterViewInit, ViewChild,viewChild } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms'
import { BsModalRef, BsModalService} from 'ngx-bootstrap/modal';
import { DataService } from '../data.service';

@Component({
  selector: 'app-adminpatientadd',
  templateUrl: './adminpatientadd.component.html',
  styleUrl: './adminpatientadd.component.css'
})
export class AdminpatientaddComponent  {

constructor(public bsmodalref:BsModalRef, public bsmodalservice: BsModalService, private dat:DataService){}

  // @ViewChild('templateDiv', { static: false }) templateDiv: TemplateRef<any> | undefined ;
  @ViewChild('templateDiv', { static: false }) templateDiv: TemplateRef<any> | undefined;

  patientForm = new FormGroup({
    patientname: new FormControl(),
    emailid: new FormControl(),
    mobile: new FormControl(),
    uid: new FormControl(),
    age: new FormControl(),
    admitteddate: new FormControl(),
    pincode: new FormControl(),
    address: new FormControl()
    
  })
  newform(){
    console.log('values are', this.patientForm.controls.patientname.value,this.patientForm.controls.emailid.value,this.patientForm.controls.mobile.value,this.patientForm.controls.uid.value,this.patientForm.controls.age.value, this.patientForm.controls.admitteddate.value,this.patientForm.controls.pincode.value, this.patientForm.controls.address.value);
    this.opentemp();
  }
  opentemp() {
    if (this.templateDiv) {
      this.bsmodalservice.show(this.templateDiv);
    } else {
      console.error('Template reference is not available');
    }
  }
  hide(){
    this.bsmodalref.hide();
  }
  submit(){
    this.dat.testapi(
      this.patientForm.value
    ).subscribe();
    this.opentemp();
  }

  // submitdiv(){
  //   this.model
  // }
}
