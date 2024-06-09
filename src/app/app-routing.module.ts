import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginChoicesComponent } from './login-choices/login-choices.component';
import { AdminAuthComponent } from './admin-auth/admin-auth.component';
import { UserAuthComponent } from './user-auth/user-auth.component';
import { AdminSignUpComponent } from './admin-sign-up/admin-sign-up.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { UserSignUpComponent } from './user-sign-up/user-sign-up.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AdminpatientaddComponent } from './adminpatientadd/adminpatientadd.component';
import { AdminPatientDetailsComponent } from './admin-patient-details/admin-patient-details.component';
import { AdminSetMedicationComponent } from './admin-set-medication/admin-set-medication.component';
import { EmergencyComponent } from './emergency/emergency.component';

const routes: Routes = [
  {path:'', redirectTo:'loginChoices', pathMatch:'full'},
  {path: 'dashboard', component:DashboardComponent},
  {path: 'loginChoices', component:LoginChoicesComponent},
  {path: 'adminAuth', component:AdminAuthComponent},
  {path: 'userAuth', component:UserAuthComponent},
  {path: 'adminSignup', component:AdminSignUpComponent},
  {path: 'adminDashboard', component:AdminDashboardComponent},
  {path: 'userSignUp', component:UserSignUpComponent},
  {path: 'navbar', component:NavbarComponent},
  {path:'adminPatientadd', component:AdminpatientaddComponent},
  {path:'adminPatientDetails', component:AdminPatientDetailsComponent},
  {path:'adminSetMedication', component:AdminSetMedicationComponent},
  {path:'emergencycomponent',component:EmergencyComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

