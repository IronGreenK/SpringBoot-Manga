package com.escalab.proyectomanga.controller;


import com.escalab.proyectomanga.model.Manga;
import com.escalab.proyectomanga.service.MangaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/manga")
public class MangaController {

    @Autowired
    private MangaService service;

    @ApiOperation(value = "Obtener todos los mangas",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Mangas")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron los mangas en la BD"),
            @ApiResponse(code = 200, message = "Petición OK")})

    @GetMapping
    public ResponseEntity<List<Manga>> listar() {
        List<Manga> lista = service.findAll();
        return new ResponseEntity<List<Manga>>(lista, HttpStatus.OK);
    }

    @ApiOperation(value = "Obtener el manga por el ID")
    @GetMapping("/{id}")
    public Manga findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @ApiOperation(value = "Obtener el manga por el titulo")
    @GetMapping("/titulo/{titulo}")
    public List<Manga> findByTitulo(@PathVariable("titulo") String titulo) {
        return service.findByTitulo(titulo);
    }

    @ApiOperation(value = "Registrar un nuevo manga")
    @PostMapping
    public @ResponseBody
    Manga save(@RequestBody Manga manga) {
        return service.save(manga);
    }

    @ApiOperation(value = "Eliminar un manga")
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(
            @PathVariable("id") Integer id
    ) {
        service.delete(id);
        return new ResponseEntity<>("Manga elimando", HttpStatus.OK);
    }
}
