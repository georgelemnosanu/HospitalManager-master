package com.siit.hospital_manager.model.dto;

import com.siit.hospital_manager.model.Doctor;
import com.siit.hospital_manager.model.Patient;
import lombok.Builder;

import java.time.LocalDateTime;
@Builder
public class AppointmentDto {

    private Integer id;
    private LocalDateTime date;
    private PatientDto patient;
    private DoctorDto doctor;



}
