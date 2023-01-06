package com.siit.hospital_manager.model.dto;

import com.siit.hospital_manager.model.Appointment;
import com.siit.hospital_manager.model.Patient;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PatientDto {
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
