package com.siit.hospital_manager.controller;

import com.siit.hospital_manager.model.Appointment;
import com.siit.hospital_manager.model.dto.AppointmentDto;
import com.siit.hospital_manager.model.dto.UpdateAppointmentDto;
import com.siit.hospital_manager.repository.AppointmentsRepository;
import com.siit.hospital_manager.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@RequiredArgsConstructor
public class AppoitmentsController {

    private final AppointmentService appointmentService;


    @GetMapping("/patient/{id}")
    public List<AppointmentDto> getPatientId(@PathVariable("id") Integer id) {
        return appointmentService.findAllByPatientId(id);
    }

    @GetMapping
    public List<AppointmentDto> findAll(){
       return appointmentService.findAll();
    }

    @PostMapping("/add")
    public void createAppointment(@Validated @RequestBody Appointment appointmentDto) {
        appointmentService.createAppointment(appointmentDto);
    }

    @PatchMapping
    public void updateAppointment(@RequestBody UpdateAppointmentDto updateAppointmentDto){
       appointmentService.updateAppointment(updateAppointmentDto);
    }
//
//    {
//        "date":"2023-03-14 11:25",
//            "patient":{
//        "id":1
//    },
//        "doctor":{
//        "id":2
//    }
//    }

}
