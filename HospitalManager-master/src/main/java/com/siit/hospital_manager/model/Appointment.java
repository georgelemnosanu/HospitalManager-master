package com.siit.hospital_manager.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")

public class Appointment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime date;


    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name="patient_id",nullable=false)
    private Patient patient;


    public Appointment(Integer id,LocalDateTime date, Patient patient) {
        this.id = id;
        this.date = date;
        this.patient = patient;
    }

    public Appointment() {
    }

    public Appointment(Appointment appointment) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
