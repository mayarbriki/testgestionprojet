package com.example.gestionprojetbrikimayar.respository;

import com.example.gestionprojetbrikimayar.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,String> {
    /*@Query("SELECT p FROM Projet p WHERE p.projetDetail.cout > :cout AND p.projetDetail.technologie = :technologie")
    List<Projet> findProjetsByCoutAndTechnologie(Long cout, String technologie);*/
    @Query(value = "SELECT p.*, pd.cout, pd.technologie \n" +
            "FROM projet p \n" +
            "JOIN projet_detail pd ON p.projet_detail_id = pd.id \n" +
            "WHERE pd.cout > ? AND pd.technologie = ?\n", nativeQuery = true)
    List<Projet> findProjetsByCoutAndTechnologie(@Param("cout") Long cout, @Param("technologie") String technologie);

}
