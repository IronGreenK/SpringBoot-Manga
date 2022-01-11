package com.escalab.proyectomanga.controller;


import com.escalab.proyectomanga.model.Usuario;
import com.escalab.proyectomanga.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> listar(){
        List<Usuario> lista = usuarioService.findAll();
        return new ResponseEntity<List<Usuario>>(lista, HttpStatus.OK);
    }
}
