import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Admin } from './Admin';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  private adminSignUpUrl = "http://localhost:8080/api/admin";

  constructor(private http: HttpClient) { }

  adminSignUp(AdminDetails: Admin){
    const headers = new HttpHeaders({'Content-Type': 'application/json'});
    return this.http.post(`${this.adminSignUpUrl}/register`, AdminDetails, {headers});
  }
}
