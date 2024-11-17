package com.example.gestionprojetbrikimayar.respository;

import com.example.gestionprojetbrikimayar.entities.ProjetDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProjetDetailRepository extends JpaRepository<ProjetDetail,Long> {

}
