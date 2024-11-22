package com.example.gestionprojetbrikimayar.service;

import com.example.gestionprojetbrikimayar.entities.Equipe;
import com.example.gestionprojetbrikimayar.respository.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EquipeService implements  IEquipeservice{
    EquipeRepository equipeRepository ;
    @Override
    public Equipe addequipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public List<Equipe> getequipe() {
        List<Equipe> equipes = equipeRepository.findAll();
        return equipes;
    }

    @Override
    public Equipe updateequipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void deleteequipe(Long id) {
equipeRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public Equipe retrieveequipe(Long id) {
        return equipeRepository.findById(Math.toIntExact(id)).get();
    }

}
