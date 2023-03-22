
package com.miportfolio.ArgPro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Datopersonal {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     
     private String nombreyapellido;
     private String domicilio;
     private String barrio;
     private String disponibilidad;
     private String estadocivil;
     private String fechanacimiento;
     private String contacto;
     private String alternativo;
     private String email;

    public Datopersonal() {
    }

    public Datopersonal(String nombreyapellido, String domicilio, String barrio, String disponibilidad, String estadocivil, String fechanacimiento, String contacto, String alternativo, String email) {
        this.nombreyapellido = nombreyapellido;
        this.domicilio = domicilio;
        this.barrio = barrio;
        this.disponibilidad = disponibilidad;
        this.estadocivil = estadocivil;
        this.fechanacimiento = fechanacimiento;
        this.contacto = contacto;
        this.alternativo = alternativo;
        this.email = email;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }


    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento= fechanacimiento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getAlternativo() {
        return alternativo;
    }

    public void setAlternativo(String alternativo) {
        this.alternativo = alternativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
     
     
}
