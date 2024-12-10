package com.example.gestionprojetbrikimayar.controller;

import com.example.gestionprojetbrikimayar.entities.Projet;
import com.example.gestionprojetbrikimayar.entities.ProjetDetail;
import com.example.gestionprojetbrikimayar.service.IProjetDetailService;
import com.example.gestionprojetbrikimayar.service.IProjetservice;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipedetail")
public class Projetdetailcontroller {


    private IProjetDetailService iprojetService;

    // Create a new Bloc
    @PostMapping("/add")
    public ResponseEntity<ProjetDetail> addBloc(@RequestBody ProjetDetail projetDetail) {
        ProjetDetail projet = iprojetService.addprojetdetail(projetDetail);
        return new ResponseEntity<>(projet, HttpStatus.CREATED);
    }


    // Retrieve all Blocs
    @GetMapping("/all")
    public ResponseEntity<List<ProjetDetail>> getAllBlocs() {
        List<ProjetDetail> blocs = iprojetService.getprojetdetail();
        return new ResponseEntity<>(blocs, HttpStatus.OK);
    }

    // Update an existing Bloc
    @PutMapping("/update")
    public ResponseEntity<ProjetDetail> updateBloc(@RequestBody ProjetDetail bloc) {
        ProjetDetail updatedBloc = iprojetService.updateBloc(bloc);
        return new ResponseEntity<>(updatedBloc, HttpStatus.OK);
    }

    // Delete a Bloc by id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBloc(@PathVariable Long id) {
        iprojetService.deleteprojetdetail(Long.valueOf(String.valueOf(id)));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/getbytechnologie/{technologie}")
    public List <ProjetDetail>recherche(@PathVariable String technologie){
      return   iprojetService.getbytechnologie(technologie);

    }

}
