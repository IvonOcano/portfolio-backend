
package com.miportfolio.ArgPro.service;

import com.miportfolio.ArgPro.entity.Habilidad;
import com.miportfolio.ArgPro.repository.RHabilidad;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad {
   
    @Autowired
public RHabilidad rHabilidad;

    
 public List<Habilidad> verHabilidades() { 
 List<Habilidad> listaHabilidades= rHabilidad.findAll();
 return listaHabilidades;
 }
 
 public void crearHabilidad(Habilidad habilidad){
     rHabilidad.save(habilidad); 
 }
 
 public void borrarHabilidad(int id){
     rHabilidad.deleteById(id);
 }

 public Habilidad buscarHabilidad(int id){
     //sino encuentra habilidades devuelve nulo o null
     Habilidad habilidad = rHabilidad.findById(id).orElse(null);
     return habilidad;
 }
 public void editarHabilidad(Habilidad habilidad) {
        rHabilidad.save(habilidad);
    }
}
