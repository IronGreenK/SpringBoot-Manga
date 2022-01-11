package com.escalab.proyectomanga.dto;

import com.escalab.proyectomanga.model.Figura;
import com.escalab.proyectomanga.model.Manga;
import com.escalab.proyectomanga.model.NovelaLigera;
import com.escalab.proyectomanga.model.Usuario;
import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.util.Date;

public class BoletaDTO extends ResourceSupport implements  Serializable{

    private int idBoleta;

    private double total;

    private String tipoDocumento;

    private Date fecha;

    private Usuario usuario;

    private Manga manga;

    private Figura figura;

    private NovelaLigera novelaLigera;


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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public NovelaLigera getNovelaLigera() {
        return novelaLigera;
    }

    public void setNovelaLigera(NovelaLigera novelaLigera) {
        this.novelaLigera = novelaLigera;
    }
}
