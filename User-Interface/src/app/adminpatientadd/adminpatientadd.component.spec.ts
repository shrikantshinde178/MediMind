import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminpatientaddComponent } from './adminpatientadd.component';

describe('AdminpatientaddComponent', () => {
  let component: AdminpatientaddComponent;
  let fixture: ComponentFixture<AdminpatientaddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdminpatientaddComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminpatientaddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
