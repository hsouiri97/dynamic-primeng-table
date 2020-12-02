package com.binarios.poc.dynamictable.repository;

import com.binarios.poc.dynamictable.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
