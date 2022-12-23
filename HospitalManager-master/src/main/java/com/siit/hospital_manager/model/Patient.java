package com.siit.hospital_manager.model;

import com.siit.hospital_manager.model.dto.CreatePatientDto;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="patients")
public class Patient {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;


    @OneToMany(mappedBy = "patient", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    List<Appointment> appointments;
    public Patient() {
    }

    public Patient(CreatePatientDto createPatientDto) {
        this.age = createPatientDto.getAge();
        this.name = createPatientDto.getName();
    }

    public Patient(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
