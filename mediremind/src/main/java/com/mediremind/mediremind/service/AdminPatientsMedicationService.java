package com.mediremind.mediremind.service;

import org.springframework.context.annotation.Configuration;

import com.mediremind.mediremind.entity.AdminPatientsMedication;

@Configuration
public interface AdminPatientsMedicationService {
	
	AdminPatientsMedication addNewMedicine(AdminPatientsMedication newMedicine);

	//AdminPatientsMedication removeExistingMedicine(String existingMedicineName);

	//List<AdminPatientsMedication> fetchAllMedicines(Long adminspatientId);

}
