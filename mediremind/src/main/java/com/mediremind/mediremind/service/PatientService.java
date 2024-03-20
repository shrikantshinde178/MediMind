package com.mediremind.mediremind.service;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Configuration;

import com.mediremind.mediremind.entity.Patient;

@Configuration
public interface PatientService {

	Patient registerPatient(Patient newPatient);
    
	Patient findPatientByEmail(String emailId);
    
	Patient updatePassword(String emailId, String newPassword);
	
	Optional<Patient> findByIndexId(Long indexId);

}
