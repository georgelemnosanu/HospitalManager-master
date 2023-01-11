package com.siit.hospital_manager.model.dto;

import com.siit.hospital_manager.model.Doctor;
import com.siit.hospital_manager.model.Patient;
import lombok.*;

import java.time.LocalDateTime;
@Data
@Builder
public class AppointmentDto {

    private Integer id;
    private LocalDateTime date;
    private Patient patient;
    private Doctor doctor;

    @Override
    public String toString() {
        return "AppointmentDto{" +
                "id=" + id +
                ", date=" + date +
                ", patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }
}
