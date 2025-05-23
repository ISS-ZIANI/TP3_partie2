package net.youssfi.patientsapp.repository;
import org.springframework.data.domain.Pageable;

import net.youssfi.patientsapp.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, Long> {
    Page<Patient> findByNomContainsIgnoreCaseOrPrenomContainsIgnoreCase(String name,String prenom, Pageable pageable);

}
