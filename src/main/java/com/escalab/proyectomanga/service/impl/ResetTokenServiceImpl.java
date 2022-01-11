package com.escalab.proyectomanga.service.impl;

import com.escalab.proyectomanga.model.ResetToken;
import com.escalab.proyectomanga.repository.ResetTokenRepository;
import com.escalab.proyectomanga.service.ResetTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResetTokenServiceImpl implements ResetTokenService {

    @Autowired
    private ResetTokenRepository repo;

    @Override
    public ResetToken findByToken(String token) {
        return repo.findByToken(token);
    }

    @Override
    public void guardar(ResetToken token) {
        repo.save(token);

    }

    @Override
    public void eliminar(ResetToken token) {
        repo.delete(token);
    }
}
