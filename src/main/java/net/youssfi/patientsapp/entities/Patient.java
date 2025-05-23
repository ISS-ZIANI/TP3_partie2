package net.youssfi.patientsapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name="PATIENTS")

@NoArgsConstructor @AllArgsConstructor @ToString @Getter @Setter @Builder
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private boolean malade;
    private int score;

}
