package com.example.gestionprojetbrikimayar.controller;

import com.example.gestionprojetbrikimayar.entities.Projet;
import com.example.gestionprojetbrikimayar.service.IProjetservice;
import com.example.gestionprojetbrikimayar.service.ProjetService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/projet")

public class Projetcontroller {



        private  IProjetservice iprojetService;

        // Create a new Bloc
        @PostMapping("/add")
        public Projet addBloc(@RequestBody Projet projet) {
           return iprojetService.addprojet(projet);
        }

        // Retrieve all Blocs
        @GetMapping("/all")
        public ResponseEntity<List<Projet>> getAllBlocs() {
            List<Projet> blocs = iprojetService.getprojet();
            return new ResponseEntity<>(blocs, HttpStatus.OK);
        }

        // Update an existing Bloc
        @PutMapping("/update")
        public ResponseEntity<Projet> updateBloc(@RequestBody Projet bloc) {
            Projet updatedBloc = iprojetService.updateprojet(bloc);
            return new ResponseEntity<>(updatedBloc, HttpStatus.OK);
        }

        // Delete a Bloc by id
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Void> deleteBloc(@PathVariable Long id) {
            iprojetService.deleteprojet(String.valueOf(id));
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    @PutMapping("/assigndetail/{projetId}/{projetDetailId}")
    public ResponseEntity<Projet> assignProjetDetailToProjet(
            @PathVariable String projetId,
            @PathVariable Long projetDetailId) {
        Projet updatedProjet = iprojetService.assignProjetDetailToProjet(projetId, projetDetailId);
        return new ResponseEntity<>(updatedProjet, HttpStatus.OK);
    }
    @PutMapping("/assignEquipe/{projetId}/{equipeId}")
    public ResponseEntity<Projet> aassignProjetToEquipe(
            @PathVariable String projetId,
            @PathVariable Integer equipeId) {
        Projet updatedProjet = iprojetService.assignProjetToEquipe (projetId, equipeId);
        return new ResponseEntity<>(updatedProjet, HttpStatus.OK);
    }
    @PostMapping("/addAndAssign")
    public ResponseEntity<Projet> addProjetAndAssignToProjetDetail(
            @RequestBody Projet projet, // Assuming the Projet is sent as a request body
            @RequestParam Long projetDetailId) {  // ProjetDetail ID as a query parameter
        Projet updatedProjet = iprojetService.addProjetAndAssignProjetToProjetDetail(projet, projetDetailId);
        return new ResponseEntity<>(updatedProjet, HttpStatus.CREATED);
    }
    @GetMapping("/projetjpql")
    public List<Projet> getProjets(@RequestParam Long cout, @RequestParam String technologie) {
        return iprojetService.getProjetsByCoutAndTechnologie(cout, technologie);
    }

}


