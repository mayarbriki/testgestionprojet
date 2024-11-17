package com.example.gestionprojetbrikimayar.respository;

import com.example.gestionprojetbrikimayar.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,String> {
}
