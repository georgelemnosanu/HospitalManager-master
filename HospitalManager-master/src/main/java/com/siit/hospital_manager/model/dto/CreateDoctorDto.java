package com.siit.hospital_manager.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateDoctorDto {
    private String name;
    private String specialization;


    public CreateDoctorDto(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

}
