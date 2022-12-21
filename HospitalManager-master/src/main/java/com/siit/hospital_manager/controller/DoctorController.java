
package com.siit.hospital_manager.controller;

import com.siit.hospital_manager.model.Doctor;
import com.siit.hospital_manager.model.dto.CreateDoctorDto;
import com.siit.hospital_manager.model.dto.DoctorDto;
import com.siit.hospital_manager.model.dto.PatientDto;
import com.siit.hospital_manager.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<DoctorDto> findAll(){
        return doctorService.findAll();
    }

    @PostMapping
    public void createDoctor(@RequestBody CreateDoctorDto createDoctorDto){
            doctorService.createDoctor(createDoctorDto);
    }

    @GetMapping("{id}")
    public DoctorDto findById(@PathVariable("id") Integer id) {
        return doctorService.findById(id);
    }



    }




