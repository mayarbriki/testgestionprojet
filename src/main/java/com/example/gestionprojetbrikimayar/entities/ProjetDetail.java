package com.example.gestionprojetbrikimayar.entities;

import com.example.gestionprojetbrikimayar.entities.Projet;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
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
    @ToString.Exclude
@JsonIgnore
    private Projet projet;
}
