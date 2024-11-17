package com.example.gestionprojetbrikimayar.service;

import com.example.gestionprojetbrikimayar.entities.ProjetDetail;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IProjetDetailService {
    ProjetDetail addprojetdetail(ProjetDetail projetDetail) ;
    List<ProjetDetail> getprojetdetail() ;
    ProjetDetail updateBloc(ProjetDetail projetDetail );
    void deleteprojetdetail(Long id) ;
}
