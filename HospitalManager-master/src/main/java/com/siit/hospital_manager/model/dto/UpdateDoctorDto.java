package com.siit.hospital_manager.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateDoctorDto {
    private Integer id;
    private String specialization;

    public UpdateDoctorDto(Integer id, String specialization) {
        this.id = id;
        this.specialization = specialization;
    }

}
