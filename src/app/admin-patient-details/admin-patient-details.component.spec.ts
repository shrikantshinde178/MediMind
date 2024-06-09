import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminPatientDetailsComponent } from './admin-patient-details.component';

describe('AdminPatientDetailsComponent', () => {
  let component: AdminPatientDetailsComponent;
  let fixture: ComponentFixture<AdminPatientDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdminPatientDetailsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminPatientDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
