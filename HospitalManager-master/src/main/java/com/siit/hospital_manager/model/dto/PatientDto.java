package com.siit.hospital_manager.model.dto;

import com.siit.hospital_manager.model.Appointment;
import com.siit.hospital_manager.model.Patient;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PatientDto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name;
    private Integer age;

    private String phoneNumber;

    public PatientDto(Patient patient) {
        this.id = patient.getId();
        this.name = patient.getName();
        this.age = patient.getAge();
        this.phoneNumber=patient.getPhoneNumber();
    }

}
