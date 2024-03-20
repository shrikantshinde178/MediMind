package com.mediremind.mediremind.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediremind.mediremind.entity.Patient;
import com.mediremind.mediremind.exception.ResourceNotFoundException;
import com.mediremind.mediremind.repository.AdminPatientsMedicationRepository;
import com.mediremind.mediremind.repository.PatientRepository;
import com.mediremind.mediremind.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository pRepo;
    
    @Autowired
    AdminPatientsMedicationRepository apmRepo;
    
    @Override
    public Patient registerPatient(Patient newPatient) {
        if (newPatient == null) {
            throw new IllegalArgumentException("Patient data cannot be null.");
        }
        return pRepo.save(newPatient);
    }

    @Override
    public Patient findPatientByEmail(String emailId) {
        Patient patient = pRepo.findByEmailId(emailId);
        if (patient == null) {
            throw new ResourceNotFoundException("Patient with email ID " + emailId + " not found.");
        }
        return patient;
    }

    @Override
    public Patient updatePassword(String emailId, String newPassword) {
        Patient patient = pRepo.findByEmailId(emailId);
        if (patient == null) {
            throw new ResourceNotFoundException("Patient with email ID " + emailId + " not found.");
        }
        patient.setPassword(newPassword);
        return pRepo.save(patient);
    }
    
    @Override
    public Optional<Patient> findByIndexId(Long indexId) {
        Optional<Patient> patient = pRepo.findByIndexId(indexId);
        if (!patient.isPresent()) {
            throw new ResourceNotFoundException("Patient with index ID " + indexId + " not found.");
        }
        return patient;
    }
}
