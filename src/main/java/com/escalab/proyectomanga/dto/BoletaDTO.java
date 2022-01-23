package com.escalab.proyectomanga.dto;

import com.escalab.proyectomanga.model.Manga;
import com.escalab.proyectomanga.model.Usuario;
import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class BoletaDTO extends ResourceSupport implements  Serializable{

    private int idBoleta;

    private LocalDate fecha;

    private Usuario usuario;

    private List<Manga> manga;

    private String nombreComprador;


    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Manga> getManga() {
        return manga;
    }

    public void setManga(List<Manga> manga) {
        this.manga = manga;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }
}
