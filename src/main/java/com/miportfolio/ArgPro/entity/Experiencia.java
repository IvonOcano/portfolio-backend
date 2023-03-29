
package com.miportfolio.ArgPro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String puesto;
    private String inicio;
     private String fin;
    private String empresa;
    private String tareas;
    



//Constructor Vacio
    public Experiencia() {
    }
//Constructor

    public Experiencia(String puesto, String inicio, String fin, String empresa, String tareas) {
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.empresa = empresa;
        this.tareas = tareas;
    }

    
     //Getters y Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }
   
    
}