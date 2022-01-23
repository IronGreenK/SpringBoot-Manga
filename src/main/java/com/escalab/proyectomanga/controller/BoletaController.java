package com.escalab.proyectomanga.controller;

import com.escalab.proyectomanga.dto.BoletaDTO;
import com.escalab.proyectomanga.model.Boleta;
import com.escalab.proyectomanga.service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

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


    @GetMapping("/dto")
    public List<BoletaDTO> fillAllDto(){
        List<BoletaDTO> dtoList = new ArrayList<>();
        List<Boleta> boletaList = service.findAll();

        boletaList.forEach(boleta -> {
            LocalDate ldt = LocalDate.now();
            BoletaDTO dto = new BoletaDTO();
            dto.setIdBoleta(boleta.getIdBoleta());
            dto.setNombreComprador(boleta.getUsuario().getNombre());
            dto.setFecha(ldt);
            dto.setUsuario(boleta.getUsuario());
            dto.setManga(boleta.getMangas());


            ControllerLinkBuilder linkTo1 = linkTo(methodOn(MangaController.class).listar());
            dto.add(linkTo1.withSelfRel());

            dtoList.add(dto);
        });


        return dtoList;
    }


}
