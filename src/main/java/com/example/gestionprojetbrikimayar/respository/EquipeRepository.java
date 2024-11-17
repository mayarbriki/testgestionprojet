package com.example.gestionprojetbrikimayar.respository;

import com.example.gestionprojetbrikimayar.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
