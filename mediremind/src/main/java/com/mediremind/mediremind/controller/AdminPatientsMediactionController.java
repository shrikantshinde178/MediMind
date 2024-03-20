package com.mediremind.mediremind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediremind.mediremind.entity.AdminPatientsMedication;
import com.mediremind.mediremind.service.AdminPatientsMedicationService;

@RestController
@RequestMapping("/api/medication")
public interface AdminPatientsMediactionController {
	
	public static final AdminPatientsMedicationService adminPatientsMedicationService = null;

	    @PostMapping("/add")
	    public static ResponseEntity<AdminPatientsMedication> addNewMedicine(@RequestBody AdminPatientsMedication newMedicine) {
	        AdminPatientsMedication savedMedicine = adminPatientsMedicationService.addNewMedicine(newMedicine);
	        return new ResponseEntity<>(savedMedicine, HttpStatus.CREATED);
	    }

}
