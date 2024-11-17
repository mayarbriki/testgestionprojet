package com.example.gestionprojetbrikimayar.entities;

import com.example.gestionprojetbrikimayar.entities.Projet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String technologie;
    private Long cout;
    private Date dateDebut;
    @OneToOne(mappedBy="projetDetail")
    private Projet projet;
}
