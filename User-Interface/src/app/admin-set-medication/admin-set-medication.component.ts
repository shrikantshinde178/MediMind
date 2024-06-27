import { Component, TemplateRef, ViewChild } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { BsModalRef, BsModalService} from 'ngx-bootstrap/modal';
import {DataService} from '../data.service'


@Component({
  selector: 'app-admin-set-medication',
  templateUrl: './admin-set-medication.component.html',
  styleUrl: './admin-set-medication.component.css'
})
export class AdminSetMedicationComponent {
  constructor(public bsmodalref:BsModalRef, public bsmodalservice: BsModalService, private dat:DataService){}
  @ViewChild('templateDiv', { static: false }) templateDiv: TemplateRef<any> | undefined;

  setmed = new FormGroup({
    med1: new FormControl(),
    med2: new FormControl(),
    med3: new FormControl(),
    med4: new FormControl(),
    med5: new FormControl(),
    med6  : new FormControl(),
    med7: new FormControl(),
    med8: new FormControl(),
    med9: new FormControl(),
    med10: new FormControl(),
    patid: new FormControl()
    
  })
  getallmed(){
    console.log(this.setmed.controls.med1,
      this.setmed.controls.med2.value,
      this.setmed.controls.med3.value,
      this.setmed.controls.med4.value,
      this.setmed.controls.med5.value,
      this.setmed.controls.med6.value,
      this.setmed.controls.med7.value,
      this.setmed.controls.med8.value,
      this.setmed.controls.med9.value,
      this.setmed.controls.med10.value,
      this.setmed.controls.patid.value
      
    )
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
    this.dat.medication(this.setmed.value).subscribe();
    this.opentemp();
  }

}
