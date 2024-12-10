package com.example.gestionprojetbrikimayar.service;

import com.example.gestionprojetbrikimayar.entities.ProjetDetail;
import com.example.gestionprojetbrikimayar.respository.ProjetDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProjetDetailService implements IProjetDetailService{
    ProjetDetailRepository projetDetailRepository;

    @Override
    public ProjetDetail addprojetdetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);    }

    @Override
    public List<ProjetDetail> getprojetdetail() {
        return projetDetailRepository.findAll();    }

    @Override
    public ProjetDetail updateBloc(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);    }

    @Override
    public void deleteprojetdetail(Long id) {
        projetDetailRepository.deleteById(id);
    }

    @Override
    public List<ProjetDetail> getbytechnologie(String technologie) {
        return projetDetailRepository.findByTechnologieContaining(technologie);

    }
}
