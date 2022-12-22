package com.siit.hospital_manager.model.dto;

public class UpdateDoctorDto {
    private Integer id;
    private String specialization;

    public UpdateDoctorDto(Integer id, String specialization) {
        this.id = id;
        this.specialization = specialization;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
