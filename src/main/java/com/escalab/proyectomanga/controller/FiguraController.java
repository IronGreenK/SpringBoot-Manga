package com.escalab.proyectomanga.controller;


import com.escalab.proyectomanga.model.Figura;
import com.escalab.proyectomanga.service.FiguraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/figura")
public class FiguraController {

    @Autowired
    private FiguraService service;

    @GetMapping
    public ResponseEntity<List<Figura>> listar(){
        List<Figura> lista = service.findAll();
        return new ResponseEntity<List<Figura>>(lista, HttpStatus.OK);
    }
}
