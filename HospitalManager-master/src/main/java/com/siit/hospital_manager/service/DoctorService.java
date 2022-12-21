package com.siit.hospital_manager.service;


import com.siit.hospital_manager.model.Doctor;
import com.siit.hospital_manager.model.dto.CreateDoctorDto;
import com.siit.hospital_manager.model.dto.DoctorDto;
import com.siit.hospital_manager.repository.DoctorJpaRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    private final DoctorJpaRepository doctorJpaRepository;


    public DoctorService(DoctorJpaRepository doctorJpaRepository) {
        this.doctorJpaRepository = doctorJpaRepository;

    }

    public List<DoctorDto> findAll(){
        return doctorJpaRepository.
                findAll().
                stream().map(DoctorDto::new).
                toList();
    }

    public DoctorDto findById(Integer id){
        Doctor doctor = doctorJpaRepository.findById(id).orElseThrow(()->new NullPointerException("Doctor with id "+ id +"has not been found"));
        return new DoctorDto(doctor);
    }


    public void createDoctor(CreateDoctorDto createDoctorDto){
        doctorJpaRepository.save(new Doctor(createDoctorDto));
    }

    public List<DoctorDto> getDoctorBySpecialization(String specialization) {
        return doctorJpaRepository.findBySpecialization(specialization).stream().map(DoctorDto::new).toList();

    }
}
