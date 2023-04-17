
package com.miportfolio.ArgPro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String lenguaje;
    private String iconoleng ;

    public Habilidad() {
    }

    public Habilidad(String lenguaje, String iconoleng) {
        this.lenguaje = lenguaje;
        this.iconoleng = iconoleng;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }


    public String getIconoleng() {
        return iconoleng;
    }

    public void setIconoleng(String iconoleng) {
        this.iconoleng = iconoleng;
    }
    
    
}
