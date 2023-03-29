
package com.miportfolio.ArgPro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sobremi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String info;
    private String imagen;
    private String fondo;
    
    public Sobremi() {
    }

    public Sobremi(String info, String imagen, String fondo) {
        this.info = info;
        this.imagen = imagen;
        this.fondo = fondo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }

}
   
