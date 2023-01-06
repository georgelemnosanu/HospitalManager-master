package com.siit.hospital_manager.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.RequiredArgsConstructor;


import java.time.LocalDateTime;
@RequiredArgsConstructor
@Data
public class UpdateAppointmentDto {
    private Integer id;

    @NotNull(message = "Date can't be null")
    @Pattern(regexp = "[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]) (2[0-3]|[01][0-9]):[0-5][0-9]")
    private LocalDateTime date;


}
