package com.example.gestionprojetbrikimayar.service;

import com.example.gestionprojetbrikimayar.entities.Equipe;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEquipeservice {
    Equipe addequipe(Equipe equipe) ;
    List<Equipe> getequipe() ;
    Equipe updateequipe(Equipe equipe );
    void deleteequipe(Long id) ;
    Equipe retrieveequipe(Long id) ;

    void updateEquipeName(Integer idEquipe, String nom);

}
