package com.siit.hospital_manager.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.siit.hospital_manager.model.dto.AppointmentDto;
import com.siit.hospital_manager.model.dto.DoctorDto;
import com.siit.hospital_manager.model.dto.PatientDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@Getter
@Setter
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime date;


    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    public Appointment(AppointmentDto appointment) {
    }

    public AppointmentDto toDto(){
        return AppointmentDto.builder().
                id(id).
                date(date).
                patient(patient).
                doctor(doctor).
                build();
    }

    public Appointment(Integer id, LocalDateTime date, Patient patient,Doctor doctor) {
        this.id = id;
        this.date = date;
        this.patient = patient;
        this.doctor= doctor;
    }

    public Appointment() {
    }

    public Appointment(Appointment appointment) {
    }

}
