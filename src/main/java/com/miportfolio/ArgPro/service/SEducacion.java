
package com.miportfolio.ArgPro.service;

import com.miportfolio.ArgPro.entity.Educacion;
import com.miportfolio.ArgPro.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
 public REducacion rEducacion;

    
    public List<Educacion> verEducaciones() { 
     List<Educacion> listaEducaciones= rEducacion.findAll();
 return listaEducaciones;
 }
 
 public void crearEducacion(Educacion educacion){
     rEducacion.save(educacion); 
 }
 
 public void borrarEducacion(int id){
     rEducacion.deleteById(id);
 }

 public Educacion buscarEducacion(int id){
     //sino encuentra educacion devuelve nulo o null
     Educacion educacion = rEducacion.findById(id).orElse(null);
     return educacion;
 }
 public void editarEducacion(Educacion educacion) {
        rEducacion.save(educacion);
    }
}
