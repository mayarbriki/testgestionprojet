package com.example.gestionprojetbrikimayar.service;

import com.example.gestionprojetbrikimayar.entities.Projet;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IProjetservice {
    Projet addprojet(Projet projet) ;
    List<Projet> getprojet() ;
    Projet updateprojet(Projet projet );
    void deleteprojet(String id) ;
    Projet retrieveprojet(String id) ;

}
