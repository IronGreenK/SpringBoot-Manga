package com.escalab.proyectomanga.model;


import javax.persistence.*;

@Entity
@Table(name = "NovelaLigera")
public class NovelaLigera {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idNovelaLigera;

    private String titulo;

    private String genero;

    private int volumen;

    private double precio;

    public NovelaLigera() {
    }

    public int getIdNovelaLigera() {
        return idNovelaLigera;
    }

    public void setIdNovelaLigera(int idNovelaLigera) {
        this.idNovelaLigera = idNovelaLigera;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
