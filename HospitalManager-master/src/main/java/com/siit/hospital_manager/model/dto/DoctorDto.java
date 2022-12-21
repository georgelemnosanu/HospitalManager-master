package com.siit.hospital_manager.model.dto;

import com.siit.hospital_manager.model.Doctor;

public class DoctorDto {
    private Integer id;
    private String name;
    private String specialization;

    public DoctorDto(Doctor doctor) {
        this.id=doctor.getId();
        this.name = doctor.getName();
        this.specialization = doctor.getSpecialization();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
