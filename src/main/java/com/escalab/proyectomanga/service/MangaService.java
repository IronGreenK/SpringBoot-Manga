package com.escalab.proyectomanga.service;

import com.escalab.proyectomanga.model.Manga;

import java.util.List;

public interface MangaService extends ICRUD<Manga>{

    List<Manga> findByTitulo(String titulo);
}
