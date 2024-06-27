import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http:HttpClient) { 
   
  }
  server_address = "http://localhost:5000/adddata";
  
  medication_server = "http://localhost:5000/medication"

  all_data = "http://localhost:5000/alldata"

  send_msg = "http://localhost:5000/send_sms"

  reversealldata = "http://localhost:5000/alldatareverse"

  
  testapi(data: any){
    return this.http.post(
      this.server_address,
      JSON.stringify(data)
    )
  }

  medication(data: any){
    return this.http.post(
      this.medication_server,
      JSON.stringify(data)
    )
  }
  alldata(){
    return this.http.get(this.all_data);
  }
  descdata(){
    return this.http.get(this.reversealldata);
  }
  sendsms(){
    return this.http.get<any>(this.send_msg);
  }

}
