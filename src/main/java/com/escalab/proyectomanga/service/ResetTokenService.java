package com.escalab.proyectomanga.service;

import com.escalab.proyectomanga.model.ResetToken;

public interface ResetTokenService {

    ResetToken findByToken(String token);

    void guardar(ResetToken token);

    void eliminar(ResetToken token);
}
