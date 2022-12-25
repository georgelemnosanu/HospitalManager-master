package com.siit.hospital_manager.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

@Getter
@Setter
public class UpdatePatientDto {

    private Integer id;
    @Range(min = 0, max = 120)
    @NotNull(message = "Age can't be null")
    private Integer age;

    public UpdatePatientDto(Integer id, Integer age) {
        this.id = id;
        this.age = age;
    }


}
