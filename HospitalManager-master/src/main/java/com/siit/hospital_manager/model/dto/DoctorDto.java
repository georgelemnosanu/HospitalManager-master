package com.siit.hospital_manager.model.dto;

import com.siit.hospital_manager.model.Appointment;
import com.siit.hospital_manager.model.Doctor;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class DoctorDto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name;
    private String specialization;

    public DoctorDto(Doctor doctor) {
        this.name = doctor.getName();
        this.specialization = doctor.getSpecialization();
    }

}
