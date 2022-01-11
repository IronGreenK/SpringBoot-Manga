package com.escalab.proyectomanga.model;


import javax.persistence.*;

@Entity
@Table(name = "Figura")
public class Figura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idFigura;

    private String nombre;

    private String escala;

    private String articulado;

    private double precio;

    public Figura() {
    }

    public int getIdFigura() {
        return idFigura;
    }

    public void setIdFigura(int idFigura) {
        this.idFigura = idFigura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getArticulado() {
        return articulado;
    }

    public void setArticulado(String articulado) {
        this.articulado = articulado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
