package com.siit.hospital_manager.service;

import com.siit.hospital_manager.model.Appointment;
import com.siit.hospital_manager.repository.AppointmentsRepository;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    private final AppointmentsRepository appointmentsRepository;

    public AppointmentService(AppointmentsRepository appointmentsRepository) {
        this.appointmentsRepository = appointmentsRepository;
    }

    public void createAppointment(Appointment appointment){
        appointmentsRepository.save(new Appointment(appointment));
    }



}
