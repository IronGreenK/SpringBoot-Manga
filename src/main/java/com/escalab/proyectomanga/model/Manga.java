package com.escalab.proyectomanga.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;


@ApiModel(description = "Información o propiedes de manga")
@Entity
@Table(name = "Manga")
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idManga;

    private String titulo;

    @ApiModelProperty(notes = "El año debe ser mayor al 1950")
    @Length(min = 1950, max = 2022)
    private int año;

    private String autor;

    private int tomo;

    private double precio;

    public Manga() {
    }

    public int getIdManga() {
        return idManga;
    }

    public void setIdManga(int idManga) {
        this.idManga = idManga;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTomo() {
        return tomo;
    }

    public void setTomo(int tomo) {
        this.tomo = tomo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
