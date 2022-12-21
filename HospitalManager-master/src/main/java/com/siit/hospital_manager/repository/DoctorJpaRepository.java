package com.siit.hospital_manager.repository;

import com.siit.hospital_manager.model.Doctor;
import com.siit.hospital_manager.model.dto.DoctorDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorJpaRepository extends JpaRepository<Doctor,Integer> {
    List<Doctor> findBySpecialization(String specialization);

}
