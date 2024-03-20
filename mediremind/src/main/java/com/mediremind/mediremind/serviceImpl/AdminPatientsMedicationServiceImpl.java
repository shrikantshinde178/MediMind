package com.mediremind.mediremind.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediremind.mediremind.entity.AdminPatientsMedication;
import com.mediremind.mediremind.repository.AdminPatientsMedicationRepository;
import com.mediremind.mediremind.service.AdminPatientsMedicationService;

@Service
public class AdminPatientsMedicationServiceImpl implements AdminPatientsMedicationService {

	@Autowired
	AdminPatientsMedicationRepository apmRepo;
	
	@Override
	public AdminPatientsMedication addNewMedicine(AdminPatientsMedication newMedicine) {
		return apmRepo.save(newMedicine);
	}


}
