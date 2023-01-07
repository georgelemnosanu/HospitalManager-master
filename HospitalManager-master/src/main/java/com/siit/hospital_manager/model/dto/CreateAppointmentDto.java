package com.siit.hospital_manager.model.dto;

import com.siit.hospital_manager.model.Doctor;
import com.siit.hospital_manager.model.Patient;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@RequiredArgsConstructor
public class CreateAppointmentDto {

    private LocalDateTime date;
    private Patient patient;
    private Doctor doctor;

}
