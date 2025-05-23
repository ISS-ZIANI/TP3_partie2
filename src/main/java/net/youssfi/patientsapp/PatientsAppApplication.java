package net.youssfi.patientsapp;

import net.youssfi.patientsapp.entities.Patient;
import net.youssfi.patientsapp.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(PatientsAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(PatientRepository patientRepository) {
        return args ->  {
            Patient p1 = new Patient();
            p1.setNom("ziani");
            p1.setPrenom("isslam");
            p1.setDateNaissance(new Date());
            p1.setScore(320);
            p1.setMalade(true);

            Patient p2 = new Patient(null, "Imane", "Imane",new Date(),false,234);

            Patient p3 = Patient.builder()
                    .nom("yassin")
                    .malade(false)
                    .score(123)
                    .build();

            patientRepository.save(p1);
            patientRepository.save(p2);
            patientRepository.save(p3);

            patientRepository.findAll().forEach(p-> {
                System.out.println(p.toString());
            });


        };
    }

}
