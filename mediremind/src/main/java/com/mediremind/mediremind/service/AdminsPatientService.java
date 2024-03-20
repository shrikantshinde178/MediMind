package com.mediremind.mediremind.service;

import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.mediremind.mediremind.entity.AdminsPatient;

@Configuration
public interface AdminsPatientService {
	
	AdminsPatient addPatient(AdminsPatient newPatient);
	
	AdminsPatient updatePatientsDetails(AdminsPatient existingPatient, Long patientId);

	AdminsPatient deletePatientById(Long patientId);
	
	//AdminsPatient deletePatientsByName(AdminsPatient patientName);
	
	List<AdminsPatient> fetchAllPatients();
	
	AdminsPatient fetchPatientById(Long patientId);

   //AdminsPatient fetchPatientsByName(String patientName);
	
}
