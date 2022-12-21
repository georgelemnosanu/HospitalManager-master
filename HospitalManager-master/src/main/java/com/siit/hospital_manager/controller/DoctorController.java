
package com.siit.hospital_manager.controller;

import com.siit.hospital_manager.model.Doctor;
import com.siit.hospital_manager.model.dto.CreateDoctorDto;
import com.siit.hospital_manager.model.dto.DoctorDto;
import com.siit.hospital_manager.model.dto.PatientDto;
import com.siit.hospital_manager.repository.DoctorJpaRepository;
import com.siit.hospital_manager.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private final DoctorService doctorService;
    private final DoctorJpaRepository doctorJpaRepository;



    public DoctorController(DoctorService doctorService , DoctorJpaRepository doctorJpaRepository) {
        this.doctorService = doctorService;
        this.doctorJpaRepository = doctorJpaRepository;
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
    public ResponseEntity<List<Doctor>> getDoctorBySpecialization(@RequestParam String specialization) {
        return new ResponseEntity<List<Doctor>>(doctorJpaRepository.findBySpecialization(specialization), HttpStatus.OK);
    }



    }




