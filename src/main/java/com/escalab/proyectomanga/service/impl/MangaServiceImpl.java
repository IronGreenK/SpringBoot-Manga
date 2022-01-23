package com.escalab.proyectomanga.service.impl;

import com.escalab.proyectomanga.exception.ModeloNotFoundException;
import com.escalab.proyectomanga.model.Manga;
import com.escalab.proyectomanga.repository.MangaRepository;
import com.escalab.proyectomanga.service.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MangaServiceImpl implements MangaService {

    @Autowired
    MangaRepository repository;

    @Override
    public List<Manga> findAll() {
        return repository.findAll();
    }

    @Override
    public Manga findById(int id) {
        Optional<Manga> op = repository.findById(id);
        if (op.isPresent()) {
            return op.get();
        } else {
            throw new ModeloNotFoundException("Manga no encontrado");
        }
    }

    @Override
    public Manga save(Manga manga) {
        return repository.save(manga);
    }

    @Override
    public Manga update(Manga manga) {
        return save(manga);
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<Manga> findByTitulo(String titulo) {
        return repository.findAllByTitulo(titulo);
    }
}
