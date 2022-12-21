package com.siit.hospital_manager.service;

import com.siit.hospital_manager.model.Patient;
import com.siit.hospital_manager.model.dto.CreatePatientDto;
import com.siit.hospital_manager.model.dto.PatientDto;
import com.siit.hospital_manager.repository.PatientJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

//    private final PatientJdbcRepository patientJdbcRepository;
//
//    public PatientService(PatientJdbcRepository patientJdbcRepository) {
//        this.patientJdbcRepository = patientJdbcRepository;
//    }

    private final PatientJpaRepository patientJpaRepository;

    public PatientService(PatientJpaRepository patientJpaRepository) {
        this.patientJpaRepository = patientJpaRepository;
    }

//    public List<Patient> findAll() {
////        return patientJdbcRepository.findAll();
//
//    }

    public List<PatientDto> findAll() {
        return patientJpaRepository.findAll()
                .stream()
                .map(PatientDto::new).toList();
    }

    public PatientDto findById(Integer id) {
        Patient patient = patientJpaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient with id " + id + " not found"));
        return new PatientDto(patient);
    }

    public void createPatient(CreatePatientDto createPatientDto) {
        patientJpaRepository.save(new Patient(createPatientDto));
    }
}
