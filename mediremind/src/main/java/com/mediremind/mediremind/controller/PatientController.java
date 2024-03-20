package com.mediremind.mediremind.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mediremind.mediremind.entity.Patient;
import com.mediremind.mediremind.service.PatientService;

	@RestController
	@RequestMapping("/api/patients")
	public class PatientController {

	    @Autowired
	    PatientService patientService;

	    @PostMapping("/register")
	    public ResponseEntity<Patient> registerPatient(@RequestBody Patient patient) {
	        Patient registeredPatient = patientService.registerPatient(patient);
	        if (registeredPatient != null) {
	            return new ResponseEntity<>(registeredPatient, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	    @GetMapping("/email/{emailId}")
	    public ResponseEntity<Patient> findPatientByEmail(@PathVariable String emailId) {
	        Patient patient = patientService.findPatientByEmail(emailId);
	        if (patient != null) {
	            return new ResponseEntity<>(patient, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @PutMapping("/password")
	    public ResponseEntity<Patient> updatePassword(@RequestParam String emailId, @RequestParam String newPassword) {
	        Patient updatedPatient = patientService.updatePassword(emailId, newPassword);
	        if (updatedPatient != null) {
	            return new ResponseEntity<>(updatedPatient, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	    
	    @GetMapping("/index/{indexId}")
	    public ResponseEntity<Patient> findByIndexId(@PathVariable Long indexId) {
	        Optional<Patient> optionalPatient = patientService.findByIndexId(indexId);
	        if (optionalPatient.isPresent()) {
	            return new ResponseEntity<>(optionalPatient.get(), HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

}
