package com.mediremind.mediremind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediremind.mediremind.entity.AdminPatientsMedication;
import com.mediremind.mediremind.entity.Patient;

@Repository
public interface AdminPatientsMedicationRepository extends JpaRepository<AdminPatientsMedication, Long>{

	AdminPatientsMedication save(Patient passwordToUpdate); 
	
	//List<AdminPatientsMedication> findByAdminspatientId(Long adminspatientId);

	}
