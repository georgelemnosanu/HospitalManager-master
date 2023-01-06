package com.siit.hospital_manager.service;

import com.siit.hospital_manager.model.Appointment;
import com.siit.hospital_manager.model.dto.AppointmentDto;
import com.siit.hospital_manager.model.dto.UpdateAppointmentDto;
import com.siit.hospital_manager.repository.AppointmentsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentsRepository appointmentsRepository;

    public AppointmentService(AppointmentsRepository appointmentsRepository) {
        this.appointmentsRepository = appointmentsRepository;
    }

    public List<AppointmentDto> findAllByPatientId(Integer id) {
        List<Appointment> appointments = appointmentsRepository.findAllByPatientId(id);

        return appointments
                .stream()
                .map(Appointment::toDto)
                .toList();
    }


    public List<AppointmentDto> findAll() {
        return appointmentsRepository.findAll()
                .stream()
                .map(Appointment::toDto)
                .toList();
    }


    public ResponseEntity<Appointment> createAppointment(Appointment appointment) {
        return new ResponseEntity<>(appointmentsRepository.save(appointment), HttpStatus.CREATED);
    }

    public void updateAppointment(UpdateAppointmentDto updateAppointmentDto){
        Appointment appointment = appointmentsRepository.findById(updateAppointmentDto.getId()).orElseThrow(()->new RuntimeException("Appointment with "+ updateAppointmentDto.getId()+"has not been found"));
        appointment.setDate(updateAppointmentDto.getDate());
        appointmentsRepository.save(appointment);
    }





}
