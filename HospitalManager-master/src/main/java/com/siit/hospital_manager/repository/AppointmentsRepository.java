package com.siit.hospital_manager.repository;

import com.siit.hospital_manager.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointment, Integer> {
    List<Appointment> findAllByPatientId(Integer id);

}
