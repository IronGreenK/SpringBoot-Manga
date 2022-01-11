package com.escalab.proyectomanga.repository;

import com.escalab.proyectomanga.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findUsuarioByNombre(String nombre);
}
