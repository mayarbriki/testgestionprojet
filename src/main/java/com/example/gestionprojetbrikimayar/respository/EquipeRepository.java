package com.example.gestionprojetbrikimayar.respository;

import com.example.gestionprojetbrikimayar.entities.Equipe;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
    @Transactional
    @Modifying
    @Query("update Equipe e set e.nom = :nom where e.id = :idEquipe")
    void updateEquipeByNom(@Param("nom") String nom, @Param("idEquipe") Integer idEquipe);

}
