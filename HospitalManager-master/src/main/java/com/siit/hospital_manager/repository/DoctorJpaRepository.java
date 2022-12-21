package com.siit.hospital_manager.repository;

import com.siit.hospital_manager.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorJpaRepository extends JpaRepository<Doctor,Integer> {
}
