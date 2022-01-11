package com.escalab.proyectomanga.repository;

import com.escalab.proyectomanga.model.NovelaLigera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NovelaLigeraRepository extends JpaRepository<NovelaLigera,Integer> {
}
