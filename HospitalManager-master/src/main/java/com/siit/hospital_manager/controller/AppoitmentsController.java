package com.siit.hospital_manager.controller;

import com.siit.hospital_manager.model.Appointment;
import com.siit.hospital_manager.repository.AppointmentsRepository;
import com.siit.hospital_manager.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@RequiredArgsConstructor
public class AppoitmentsController {

    private final AppointmentsRepository appointmentsRepository;
    private final AppointmentService appointmentService;


    @GetMapping("/patient/{id}")
    public List<Appointment> getPatientId(@PathVariable("id") Integer id) {
        return appointmentsRepository.findAllByPatientId(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Appointment> createAppointment(@Validated @RequestBody Appointment appointment) {
        return new ResponseEntity<>(appointmentsRepository.save(appointment), HttpStatus.CREATED);
    }

}
