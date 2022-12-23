package com.siit.hospital_manager.model;

import com.siit.hospital_manager.model.dto.CreateDoctorDto;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name;
    private String specialization;

    public Doctor() {
    }

    public Doctor(CreateDoctorDto createDoctorDto){
        this.name=createDoctorDto.getName();
        this.specialization=createDoctorDto.getSpecialization();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
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

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
