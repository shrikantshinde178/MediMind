package com.mediremind.mediremind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mediremind.mediremind.entity.AdminsPatient;
import com.mediremind.mediremind.service.AdminsPatientService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/admin/patient")
@AllArgsConstructor
public class AdminsPatientController {

    @Autowired
    AdminsPatientService adminsPatientService;

    @PostMapping("/add")
    public AdminsPatient addPatient(@RequestBody AdminsPatient newPatient) {
        return adminsPatientService.addPatient(newPatient);
    }

    @PutMapping("/update/{patientId}")
    public AdminsPatient updatePatientDetails(@RequestBody AdminsPatient existingPatient, @PathVariable Long patientId) {
        return adminsPatientService.updatePatientsDetails(existingPatient, patientId);
    }

    @DeleteMapping("/delete/{patientId}")
    public AdminsPatient deletePatientById(@PathVariable Long patientId) {
        return adminsPatientService.deletePatientById(patientId);
    }

    @GetMapping("/all")
    public List<AdminsPatient> fetchAllPatients() {
        return adminsPatientService.fetchAllPatients();
    }
    
    @GetMapping("/patient/{patientId}")
    public AdminsPatient fetchPatientById(@PathVariable Long patientId) {
        return adminsPatientService.fetchPatientById(patientId);
    }

//    @GetMapping("/name/{patientName}")
//    public AdminsPatient fetchPatientByName(@PathVariable("patientName") String patientName) {
//        return adminsPatientService.fetchPatientsByName(patientName);
//    }
//    
}
