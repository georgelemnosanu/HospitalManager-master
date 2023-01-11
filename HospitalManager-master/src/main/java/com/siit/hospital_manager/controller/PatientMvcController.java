package com.siit.hospital_manager.controller;

import com.siit.hospital_manager.model.dto.CreatePatientDto;
import com.siit.hospital_manager.model.dto.PatientDto;
import com.siit.hospital_manager.service.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mvc/patient")
public class PatientMvcController {
    private final PatientService patientService;


    @GetMapping("viewAll")
    public String getAllPatients(Model model){
        List<PatientDto> patientDtoList=patientService.findAll();
        model.addAttribute("patients",patientDtoList);
        return "patient/viewAll";
    }

    @PostMapping(value="/submit")
    public String createPatient(@Valid @ModelAttribute("createPatientDto") CreatePatientDto createPatientDto, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "validationError";
        }
        patientService.createPatient(createPatientDto);
        model.addAttribute("createPatientDto",createPatientDto);
        return "success";
    }


    @GetMapping("/create")
    public String showCreateForm(Model model){
        CreatePatientDto createPatientDto = new CreatePatientDto();
        model.addAttribute("createPatientDto",createPatientDto);
        return "patient/create";
    }




}
