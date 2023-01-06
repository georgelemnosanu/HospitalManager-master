package com.siit.hospital_manager.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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



    @NotNull(message = "Phone number can't be null")
    @Pattern(regexp="(07[0-8]{1}[0-9]{1}|02[0-9]{2}|03[0-9]{2}){1}?(\\s|\\.|\\-)?([0-9]{3}(\\s|\\.|\\-|)){2}$")
            private String phoneNumber;

    public UpdatePatientDto(Integer id, Integer age) {
        this.id = id;
        this.age = age;
    }


}
