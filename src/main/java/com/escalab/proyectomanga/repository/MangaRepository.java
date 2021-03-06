package com.escalab.proyectomanga.repository;

import com.escalab.proyectomanga.model.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Integer> {

    List<Manga> findAllByTitulo(String titulo);
}
