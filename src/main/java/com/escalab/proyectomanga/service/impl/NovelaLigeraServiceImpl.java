package com.escalab.proyectomanga.service.impl;

import com.escalab.proyectomanga.model.NovelaLigera;
import com.escalab.proyectomanga.repository.NovelaLigeraRepository;
import com.escalab.proyectomanga.service.NovelaLigeraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelaLigeraServiceImpl implements NovelaLigeraService {

    @Autowired
    NovelaLigeraRepository repository;

    @Override
    public List<NovelaLigera> findAll() {
        return repository.findAll();
    }

    @Override
    public NovelaLigera findById(Integer id) {
        return null;
    }

    @Override
    public NovelaLigera save(NovelaLigera novelaLigera) {
        return null;
    }

    @Override
    public NovelaLigera update(NovelaLigera novelaLigera) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
