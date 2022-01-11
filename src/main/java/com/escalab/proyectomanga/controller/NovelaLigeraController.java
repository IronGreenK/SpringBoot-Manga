package com.escalab.proyectomanga.controller;


import com.escalab.proyectomanga.model.NovelaLigera;
import com.escalab.proyectomanga.service.NovelaLigeraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/novela-ligera")
public class NovelaLigeraController {

    @Autowired
    private NovelaLigeraService service;

    @GetMapping
    public ResponseEntity<List<NovelaLigera>> listar(){
        List<NovelaLigera> lista = service.findAll();
        return new ResponseEntity<List<NovelaLigera>>(lista, HttpStatus.OK);
    }
}
