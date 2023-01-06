package com.siit.hospital_manager.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.siit.hospital_manager.model.dto.CreatePatientDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "patients")
@Getter
@Setter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private String phoneNumber;

//    @JsonManagedReference
//    @OneToMany(mappedBy = "patient", fetch = FetchType.EAGER,
//                cascade = CascadeType.ALL)
//    List<Appointment> appointments;

    public Patient() {
    }

    public Patient(CreatePatientDto createPatientDto) {
        this.age = createPatientDto.getAge();
        this.name = createPatientDto.getName();
    }

    public Patient(Integer id, String name, Integer age,String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber=phoneNumber;
    }

}
