package com.miportfolio.ArgPro.service;

import com.miportfolio.ArgPro.entity.Proyecto;
import com.miportfolio.ArgPro.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired
    public RProyecto rProyecto;
    
    
    public List<Proyecto> verProyectos() { 
     List<Proyecto> listaProyectos= rProyecto.findAll();
 return listaProyectos;
 }
 
 public void crearProyecto(Proyecto proyecto){
     rProyecto.save(proyecto); 
 }
 
 public void borrarProyecto(int id){
     rProyecto.deleteById(id);
 }

 public Proyecto buscarProyecto(int id){
     //sino encuentra el proyecto devuelve nulo o null
     Proyecto proyecto = rProyecto.findById(id).orElse(null);
     return proyecto;
 }
 public void editarProyecto(Proyecto proyecto) {
        rProyecto.save(proyecto);
    }
    
}
