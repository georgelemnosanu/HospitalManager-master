package com.siit.hospital_manager.repository;

import com.siit.hospital_manager.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientJpaRepository extends JpaRepository<Patient, Integer> {

}
