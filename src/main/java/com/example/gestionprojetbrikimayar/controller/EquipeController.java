package com.example.gestionprojetbrikimayar.controller;

import com.example.gestionprojetbrikimayar.entities.Equipe;
import com.example.gestionprojetbrikimayar.service.IEquipeservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeController {
    IEquipeservice equipeService;

    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getequipe() {
        List<Equipe> listEquipes = equipeService.getequipe();
        return listEquipes;
    }
    @PostMapping("/add-Equipe")
    public Equipe addEquipe(@RequestBody Equipe b) {
        Equipe Equipe = equipeService.addequipe (b);
        return Equipe;
    }
    @PutMapping("/modify-Equipe")
    public Equipe modifyEquipe(@RequestBody Equipe b) {
        Equipe Equipe = equipeService.updateequipe(b);
        return Equipe;
    }
    @DeleteMapping("/remove-Equipe/{Equipe-id}")
    public void removeEquipe(@PathVariable("Equipe-id") Integer id) {
        equipeService.deleteequipe(Long.valueOf(id));
    }
    @PutMapping("/{id}/nom")
    public void updateEquipeName(@PathVariable("id") Integer idEquipe, @RequestParam("nom") String nom) {
        equipeService.updateEquipeName(idEquipe, nom);
    }

}