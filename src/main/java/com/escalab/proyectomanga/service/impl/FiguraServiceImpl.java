package com.escalab.proyectomanga.service.impl;

import com.escalab.proyectomanga.model.Figura;
import com.escalab.proyectomanga.repository.FiguraRepository;
import com.escalab.proyectomanga.service.FiguraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiguraServiceImpl implements FiguraService {

    @Autowired
    FiguraRepository repository;

    @Override
    public List<Figura> findAll() {
        return repository.findAll();
    }

    @Override
    public Figura findById(int id) {
        return null;
    }

    @Override
    public Figura save(Figura figura) {
        return null;
    }

    @Override
    public Figura update(Figura figura) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
