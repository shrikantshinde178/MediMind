package com.mediremind.mediremind.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediremind.mediremind.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

	  Patient findByEmailId(String emailId);
	  
	  Optional<Patient> findByIndexId(Long indexId);
	  
}



