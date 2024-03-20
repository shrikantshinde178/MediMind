package com.mediremind.mediremind.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediremind.mediremind.entity.AdminsPatient;
import com.mediremind.mediremind.repository.AdminsPatientRepository;
import com.mediremind.mediremind.service.AdminsPatientService;

@Service
public class AdminsPatientServiceImpl implements AdminsPatientService{

	@Autowired
	private AdminsPatientRepository adPatientsRepo;

// ------------------------------------------------------------------------------------
	
	@Override
	public AdminsPatient addPatient(AdminsPatient newPatient) {
		return adPatientsRepo.save(newPatient);
	}
	
// ------------------------------------------------------------------------------------

	@Override
	public AdminsPatient updatePatientsDetails(AdminsPatient existingPatient, Long patientId) {
		AdminsPatient patientToUpdate = adPatientsRepo.findById(patientId).orElseThrow(() -> new RuntimeException("Patient not found with id: " + patientId));
		patientToUpdate.setPatientAddress(existingPatient.getPatientAddress());
		patientToUpdate.setPatientPincode(existingPatient.getPatientPincode());
		patientToUpdate.setPatientMobile(existingPatient.getPatientMobile());
		return adPatientsRepo.save(patientToUpdate);
	}

// ------------------------------------------------------------------------------------
	
	@Override
	public AdminsPatient deletePatientById(Long patientId) {
		Optional<AdminsPatient> patient = adPatientsRepo.findById(patientId);
		
	if (patient.isPresent()) {
			adPatientsRepo.delete(patient.get());
			return patient.get();
	} else {
			throw new IllegalArgumentException("Patient with ID " + patientId + " not found");
		}
	
	}
	
// ------------------------------------------------------------------------------------
	
	@Override
	public List<AdminsPatient> fetchAllPatients() {
		return adPatientsRepo.findAll();
	}
	
// ------------------------------------------------------------------------------------	

	@Override
	public AdminsPatient fetchPatientById(Long patientId) {
		return adPatientsRepo.findById(patientId)
				.orElseThrow(() -> new RuntimeException("Patient not found with id: " + patientId));
	}

// ------------------------------------------------------------------------------------
	
//	@Override
//	public AdminsPatient fetchPatientsByName(String patientName) {
//		return adPatientsRepo.findByAdminsPatientName(patientName);
//	}

}
