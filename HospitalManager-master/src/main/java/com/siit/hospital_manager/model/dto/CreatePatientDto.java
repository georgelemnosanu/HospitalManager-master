package com.siit.hospital_manager.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePatientDto {

    private String name;
    private Integer age;

    public CreatePatientDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
