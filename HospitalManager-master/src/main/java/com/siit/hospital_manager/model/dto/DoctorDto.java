package com.siit.hospital_manager.model.dto;

import com.siit.hospital_manager.model.Doctor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorDto {
    private String name;
    private String specialization;

    public DoctorDto(Doctor doctor) {
        this.name = doctor.getName();
        this.specialization = doctor.getSpecialization();
    }

}
