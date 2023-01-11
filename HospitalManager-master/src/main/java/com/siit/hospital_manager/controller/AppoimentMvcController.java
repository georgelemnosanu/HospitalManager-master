package com.siit.hospital_manager.controller;

import com.siit.hospital_manager.model.dto.AppointmentDto;
import com.siit.hospital_manager.model.dto.CreateAppointmentDto;
import com.siit.hospital_manager.model.dto.CreatePatientDto;
import com.siit.hospital_manager.model.dto.PatientDto;
import com.siit.hospital_manager.service.AppointmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequiredArgsConstructor
@RequestMapping("/mvc/appointment")
public class AppoimentMvcController {

    private final AppointmentService appointmentService;


    @GetMapping("viewAppointments")
    public String getAllAppointments(Model model){
        List<AppointmentDto> appointmentDtosList= appointmentService.findAll();
        model.addAttribute("appointments",appointmentDtosList);
        return "appointment/viewAppointments";
    }

    @PostMapping(value="/submit")
    public String createPatient(@Valid @ModelAttribute("createAppointmentDto")CreateAppointmentDto createAppointmentDto, BindingResult bindingResult, Model model){
        appointmentService.createAppointment(createAppointmentDto);
        model.addAttribute("createAppointmentDto",createAppointmentDto);
        return "successAppointment";
    }

    @GetMapping("/createAppointment")
    public String showCreateForm(Model model){
         CreateAppointmentDto createAppointmentDto = new CreateAppointmentDto();
        model.addAttribute("createAppointmentDto",createAppointmentDto);
        return "appointment/createAppointment";
    }

}
