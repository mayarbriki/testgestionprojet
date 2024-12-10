package com.example.gestionprojetbrikimayar.respository;

import com.example.gestionprojetbrikimayar.entities.ProjetDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProjetDetailRepository extends JpaRepository<ProjetDetail,Long> {
public List<ProjetDetail> findByTechnologieLike(String technologie);
    public List<ProjetDetail> findByTechnologieContaining(String technologie);

}
