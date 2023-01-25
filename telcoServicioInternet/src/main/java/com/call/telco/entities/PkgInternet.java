package com.call.telco.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "pkginternet")
public class PkgInternet {

    @Transient
    public static final String SEQUENCE_NAME = "internet_sequence";

    @Id
    private long id;
    private String descripcion;

    private String precio;

    private String beneficio;

    private String tiempo;

    public PkgInternet() {
    }

    public PkgInternet(long id, String descripcion, String precio, String beneficio, String tiempo) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.beneficio = beneficio;
        this.tiempo = tiempo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "PkgInternet{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", precio='" + precio + '\'' +
                ", beneficio='" + beneficio + '\'' +
                ", tiempo='" + tiempo + '\'' +
                '}';
    }
}
