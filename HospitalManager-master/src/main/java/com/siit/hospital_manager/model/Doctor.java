package com.siit.hospital_manager.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.siit.hospital_manager.model.dto.CreateDoctorDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "doctors")
@Getter
@Setter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String name;
    private String specialization;


//    @OneToMany(mappedBy = "doctor", fetch = FetchType.EAGER,
//            cascade = CascadeType.ALL)
//    List<Appointment> appointments;
    public Doctor() {
    }

    public Doctor(CreateDoctorDto createDoctorDto) {
        this.name = createDoctorDto.getName();
        this.specialization = createDoctorDto.getSpecialization();
    }

}
