package com.example.gestionprojetbrikimayar.service;

import com.example.gestionprojetbrikimayar.entities.Equipe;
import com.example.gestionprojetbrikimayar.entities.Projet;
import com.example.gestionprojetbrikimayar.entities.ProjetDetail;
import com.example.gestionprojetbrikimayar.respository.EquipeRepository;
import com.example.gestionprojetbrikimayar.respository.ProjetDetailRepository;
import com.example.gestionprojetbrikimayar.respository.ProjetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProjetService implements IProjetservice{
    ProjetRepository projetRepository ;
    ProjetDetailRepository projetDetailRepository ;
    EquipeRepository  equipeRepository ;
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

    @Override
    public Projet assignProjetDetailToProjet(String projetId, Long projetDetailId) {
        Projet projet = projetRepository.findById(projetId).get();

        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();

        projet.setProjetDetail(projetDetail);
        return projetRepository.save(projet);
    }

    @Override
    public Projet assignProjetToEquipe(String projetId, Integer equipeId) {

            Projet projet = projetRepository.findById(projetId).get();
            Equipe equipe = equipeRepository.findById(equipeId).get();
            equipe.getProjets().add(projet);
            equipeRepository.save(equipe);
            return projet;    }


}
