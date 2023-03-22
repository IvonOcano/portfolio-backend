
package com.miportfolio.ArgPro.service;

import com.miportfolio.ArgPro.entity.Red;
import com.miportfolio.ArgPro.repository.RRed;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRed {
    @Autowired
  public RRed rRed;

public List<Red> verRedes() { 
     List<Red> listaRedes= rRed.findAll();
 return listaRedes;
 }
 
 public void crearRed(Red red){
     rRed.save(red); 
 }
 
 public void borrarRed(int id){
     rRed.deleteById(id);
 }

 public Red buscarRed(int id){
     //sino encuentra la red devuelve nulo o null
     Red red = rRed.findById(id).orElse(null);
     return red;
 }
 public void editarRed(Red red) {
        rRed.save(red);
    }
}
