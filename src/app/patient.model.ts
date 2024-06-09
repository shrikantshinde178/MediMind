export class Patient {
  constructor(
    public pid: number,
    public patientName: string,
    public emailId: string,
    public uid: number,
    public mobile: string,
    public age: number,
    public admittedDate: string,
    public pinCode: number,
    public address: string
  ) { }
}
