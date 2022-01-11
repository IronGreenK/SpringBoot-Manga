package com.escalab.proyectomanga.service.impl;

import com.escalab.proyectomanga.model.Usuario;
import com.escalab.proyectomanga.repository.UsuarioRepository;
import com.escalab.proyectomanga.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UsuarioServiceImpl implements UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Integer id) {
        Optional<Usuario> op = usuarioRepository.findById(id);
        return op.isPresent() ? op.get() : new Usuario();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public boolean delete(Integer id) {
        usuarioRepository.deleteById(id);
        return true;
    }


    public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findUsuarioByNombre(nombre);
        if(usuario == null) {
            throw new UsernameNotFoundException(String.format("Usuario no existe: ", nombre));
        }
        List<GrantedAuthority> roles = new ArrayList<>();
        usuario.getRoles().forEach(rol -> {
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        });
        UserDetails ud = new User(usuario.getNombre(), usuario.getClave(), roles);
        return ud;
    }
}
