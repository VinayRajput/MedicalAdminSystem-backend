package com.masapp.medicaladminsystem.docLogin.repository;

import com.masapp.medicaladminsystem.docLogin.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine,Long> {

}
