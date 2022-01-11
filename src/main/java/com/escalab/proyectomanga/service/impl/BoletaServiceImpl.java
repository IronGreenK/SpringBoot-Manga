package com.escalab.proyectomanga.service.impl;

import com.escalab.proyectomanga.exception.ModeloNotFoundException;
import com.escalab.proyectomanga.model.Boleta;
import com.escalab.proyectomanga.model.Manga;
import com.escalab.proyectomanga.repository.BoletaRepository;
import com.escalab.proyectomanga.service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoletaServiceImpl implements BoletaService {

    @Autowired
    BoletaRepository repository;


    @Override
    public List<Boleta> findAll() {
        return repository.findAll();
    }

    @Override
    public Boleta findById(Integer id) {
        Optional<Boleta> op = repository.findById(id);
        if (op.isPresent()) {
            return op.get();
        } else {
            throw new ModeloNotFoundException("Boleta no encontrada");
        }
    }

    @Override
    public Boleta save(Boleta boleta) {
        return repository.save(boleta);
    }

    @Override
    public Boleta update(Boleta boleta) {
        return save(boleta);
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return true;
    }
}
