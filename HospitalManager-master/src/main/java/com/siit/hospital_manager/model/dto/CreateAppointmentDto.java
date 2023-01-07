package com.siit.hospital_manager.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.siit.hospital_manager.model.Doctor;
import com.siit.hospital_manager.model.Patient;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
@Getter
@Setter
@RequiredArgsConstructor
public class CreateAppointmentDto {

    @Column(name = "date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime date;


    private Patient patient;
    private Doctor doctor;

}
