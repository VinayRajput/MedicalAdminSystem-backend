package com.masapp.medicaladminsystem.docLogin.controller;

import com.masapp.medicaladminsystem.docLogin.entity.Medicine;
import com.masapp.medicaladminsystem.docLogin.repository.MedicineRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicine")
public class MedicineController {
    MedicineRepository medicineRepository;

    public MedicineController(MedicineRepository medicine) {
        super();
        this.medicineRepository = medicine;
    }

    @PostMapping("/insert")
    public Medicine createMedicine(@RequestBody Medicine medicine) {
        return medicineRepository.save(medicine);
    }
}
