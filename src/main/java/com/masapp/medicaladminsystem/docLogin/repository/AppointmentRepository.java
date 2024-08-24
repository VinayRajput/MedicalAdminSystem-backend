package com.masapp.medicaladminsystem.docLogin.repository;

import com.masapp.medicaladminsystem.docLogin.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
