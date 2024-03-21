import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginChoicesComponent } from './login-choices/login-choices.component';
import { AdminAuthComponent } from './admin-auth/admin-auth.component';
import { UserAuthComponent } from './user-auth/user-auth.component';
import { AdminSignUpComponent } from './admin-sign-up/admin-sign-up.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { UserSignUpComponent } from './user-sign-up/user-sign-up.component';
import { AdminpatientaddComponent } from './adminpatientadd/adminpatientadd.component';
import { AdminPatientDetailsComponent } from './admin-patient-details/admin-patient-details.component';
import { AdminSetMedicationComponent } from './admin-set-medication/admin-set-medication.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    LoginChoicesComponent,
    AdminAuthComponent,
    UserAuthComponent,
    AdminSignUpComponent,
    AdminDashboardComponent,
    UserSignUpComponent,
    AdminpatientaddComponent,
    AdminPatientDetailsComponent,
    AdminSetMedicationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path:'dashboard', component:DashboardComponent},
      {path:'loginChoices', component:LoginChoicesComponent},
      {path:'adminAuth', component:AdminAuthComponent},
      {path:'userAuth', component:UserAuthComponent},
      {path:'adminSignup', component:AdminSignUpComponent},
      {path:'adminDashboard', component:AdminDashboardComponent},
      {path: 'userSignUp', component:UserSignUpComponent},
      {path: 'adminDashboard', component:AdminDashboardComponent},
      {path: 'adminPatientadd', component:AdminpatientaddComponent},
      {path:'adminPatientDetails', component:AdminPatientDetailsComponent},
      {path:'adminSetMedication', component:AdminSetMedicationComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
