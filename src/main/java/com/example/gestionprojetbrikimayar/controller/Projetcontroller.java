package com.example.gestionprojetbrikimayar.controller;

import com.example.gestionprojetbrikimayar.entities.Projet;
import com.example.gestionprojetbrikimayar.service.IProjetservice;
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
    }


