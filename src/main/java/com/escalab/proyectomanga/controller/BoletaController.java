package com.escalab.proyectomanga.controller;

import com.escalab.proyectomanga.model.Boleta;
import com.escalab.proyectomanga.service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/boleta")
public class BoletaController {

    @Autowired
    private BoletaService service;


    @GetMapping
    public ResponseEntity<List<Boleta>> listar() {
        List<Boleta> lista = service.findAll();
        return new ResponseEntity<List<Boleta>>(lista, HttpStatus.OK);
    }


}
