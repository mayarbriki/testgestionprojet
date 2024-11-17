package com.example.gestionprojetbrikimayar.service;

import com.example.gestionprojetbrikimayar.entities.Projet;
import com.example.gestionprojetbrikimayar.respository.ProjetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProjetService implements IProjetservice{
    ProjetRepository projetRepository ;
    @Override
    public Projet addprojet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public List<Projet> getprojet() {
      List<Projet> projets =projetRepository.findAll();
        return projets ;
    }

    @Override
    public Projet updateprojet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public void deleteprojet(String id) {
projetRepository.deleteById(id);
    }

    @Override
    public Projet retrieveprojet(String id) {
        return projetRepository.findById(id).orElse(null);
    }

}
