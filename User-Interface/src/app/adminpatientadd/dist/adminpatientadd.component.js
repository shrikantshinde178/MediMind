"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
exports.AdminpatientaddComponent = void 0;
var core_1 = require("@angular/core");
var forms_1 = require("@angular/forms");
var AdminpatientaddComponent = /** @class */ (function () {
    function AdminpatientaddComponent() {
        this.patientForm = new forms_1.FormGroup({
            patientname: new forms_1.FormControl(),
            emailid: new forms_1.FormControl(),
            mobile: new forms_1.FormControl(),
            uid: new forms_1.FormControl(),
            age: new forms_1.FormControl(),
            admitteddate: new forms_1.FormControl(),
            pincode: new forms_1.FormControl(),
            address: new forms_1.FormControl()
        });
    }
    AdminpatientaddComponent.prototype.newform = function () {
        console.log('values are', this.patientForm.controls.patientname.value, this.patientForm.controls.emailid.value, this.patientForm.controls.mobile.value, this.patientForm.controls.uid.value, this.patientForm.controls.age.value, this.patientForm.controls.admitteddate.value, this.patientForm.controls.pincode.value, this.patientForm.controls.address.value);
    };
    AdminpatientaddComponent.prototype.submitdiv = function () {
        this.model;
    };
    AdminpatientaddComponent = __decorate([
        core_1.Component({
            selector: 'app-adminpatientadd',
            templateUrl: './adminpatientadd.component.html',
            styleUrl: './adminpatientadd.component.css'
        })
    ], AdminpatientaddComponent);
    return AdminpatientaddComponent;
}());
exports.AdminpatientaddComponent = AdminpatientaddComponent;
