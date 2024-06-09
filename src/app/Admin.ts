export class Admin{
    constructor(
        public adminId: number,
        public adminName: string,
        public password: string,
        public adminEmailId: string,
        public contactNumber: number,
        public doctorLisenceNumber: string,
        public hospitalName: string,
        public hospitalAddress: string,
        public pinCode: number
    ){ }
}