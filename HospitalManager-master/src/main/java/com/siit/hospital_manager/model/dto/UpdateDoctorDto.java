package com.siit.hospital_manager.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateDoctorDto {
    private Integer id;
    @NotNull(message = "Specialization can not be null")
    @Pattern(regexp = "[A-Z][a-z]{1,15}+ [A-Z][a-z]{1,15}+")
    private String specialization;

    public UpdateDoctorDto(Integer id, String specialization) {
        this.id = id;
        this.specialization = specialization;
    }

}
