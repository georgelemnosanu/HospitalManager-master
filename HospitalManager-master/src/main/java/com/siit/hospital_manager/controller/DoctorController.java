
package com.siit.hospital_manager.controller;

import com.siit.hospital_manager.model.dto.CreateDoctorDto;
import com.siit.hospital_manager.model.dto.DoctorDto;
import com.siit.hospital_manager.model.dto.UpdateDoctorDto;
import com.siit.hospital_manager.repository.DoctorJpaRepository;
import com.siit.hospital_manager.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private final DoctorService doctorService;


    public DoctorController(DoctorService doctorService , DoctorJpaRepository doctorJpaRepository) {
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

    @GetMapping("/doctors/specialization")
    public List<DoctorDto> getDoctorBySpecialization(@RequestParam String specialization) {
        return doctorService.getDoctorBySpecialization(specialization);
    }

    @PatchMapping
    public void updateDoctor(@RequestBody UpdateDoctorDto updateDoctorDto){
        doctorService.updateDoctor(updateDoctorDto);
    }

    @DeleteMapping
    public void deleteDoctor(@RequestParam("id")Integer id){
        doctorService.deleteDoctor(id);
    }




    }




