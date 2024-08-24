package com.masapp.medicaladminsystem.controller;

import com.masapp.medicaladminsystem.entity.Patient;
import com.masapp.medicaladminsystem.repository.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/patient")
public class PatientController {
    private PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        super();
        this.patientRepository = patientRepository;
    }

    @PostMapping("/insert")
    public Patient createPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

}
