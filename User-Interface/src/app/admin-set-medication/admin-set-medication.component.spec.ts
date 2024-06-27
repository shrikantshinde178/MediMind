import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminSetMedicationComponent } from './admin-set-medication.component';

describe('AdminSetMedicationComponent', () => {
  let component: AdminSetMedicationComponent;
  let fixture: ComponentFixture<AdminSetMedicationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdminSetMedicationComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminSetMedicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
