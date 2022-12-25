package com.siit.hospital_manager.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePatientDto {


    private Integer id;
    private Integer age;

    public UpdatePatientDto(Integer id, Integer age) {
        this.id = id;
        this.age = age;
    }


}
