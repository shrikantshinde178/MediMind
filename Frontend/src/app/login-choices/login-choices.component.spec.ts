import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginChoicesComponent } from './login-choices.component';

describe('LoginChoicesComponent', () => {
  let component: LoginChoicesComponent;
  let fixture: ComponentFixture<LoginChoicesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LoginChoicesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LoginChoicesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
