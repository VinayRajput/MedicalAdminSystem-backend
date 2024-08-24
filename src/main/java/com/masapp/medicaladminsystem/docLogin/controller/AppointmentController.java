package com.masapp.medicaladminsystem.docLogin.controller;

import com.masapp.medicaladminsystem.docLogin.entity.Appointment;
import com.masapp.medicaladminsystem.docLogin.repository.AppointmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
    AppointmentRepository appointmentRepository;

    public AppointmentController(AppointmentRepository appointmentRepository) {
        super();
        this.appointmentRepository = appointmentRepository;
    }

    @PostMapping("/insert")
    public Appointment createAppointment(@RequestBody Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    @GetMapping("/all")
    public List<Appointment> getAppointment(){
        return appointmentRepository.findAll();
    }
}
