package com.mediremind.mediremind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mediremind.mediremind.entity.AdminsPatient;

@Repository
public interface AdminsPatientRepository extends JpaRepository<AdminsPatient, Long> {

////	AdminsPatient findByName(String patientName);
//	AdminsPatient findByName(String patientName);
//
//	@Query("SELECT p FROM AdminsPatient p WHERE p.patientName = ?patientName")
//	AdminsPatient findByAdminsPatientName(@Param("patientName") String patientName);

	
}
