package com.escalab.proyectomanga.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Boleta")
public class Boleta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idBoleta;

    private double total;

    private String tipoDocumento;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false, foreignKey = @ForeignKey(name="FK_boleta_usuario"))
    private Usuario usuario;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "Boleta_Figura",
            joinColumns = @JoinColumn(name = "id_boleta", referencedColumnName = "idBoleta"),
            inverseJoinColumns = @JoinColumn(name = "id_figura", referencedColumnName = "idFigura"))
    private List<Figura> figuras;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "Boleta_Manga",
            joinColumns = @JoinColumn(name = "id_boleta", referencedColumnName = "idBoleta"),
            inverseJoinColumns = @JoinColumn(name = "id_manga", referencedColumnName = "idManga"))
    private List<Manga> mangas;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "Boleta_NovelaLigera",
            joinColumns = @JoinColumn(name = "id_boleta", referencedColumnName = "idBoleta"),
            inverseJoinColumns = @JoinColumn(name = "id_novelaLigera", referencedColumnName = "idNovelaLigera"))
    private List<NovelaLigera> novelaLigeras;


    public Boleta() {
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public List<Manga> getMangas() {
        return mangas;
    }

    public void setMangas(List<Manga> mangas) {
        this.mangas = mangas;
    }

    public List<NovelaLigera> getNovelaLigeras() {
        return novelaLigeras;
    }

    public void setNovelaLigeras(List<NovelaLigera> novelaLigeras) {
        this.novelaLigeras = novelaLigeras;
    }
}
