
package com.miportfolio.ArgPro.service;

import com.miportfolio.ArgPro.entity.Datopersonal;
import com.miportfolio.ArgPro.repository.RDatopersonal;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SDatopersonal {
  
    @Autowired
public RDatopersonal rDatopersonal;

    
 public List<Datopersonal> verDatospersonales() { 
 List<Datopersonal> listaDatospersonales= rDatopersonal.findAll();
 return listaDatospersonales;
 }
 
 public void crearDatopersonal(Datopersonal datopersonal){
     rDatopersonal.save(datopersonal); 
 }
 
 public void borrarDatopersonal(int id){
     rDatopersonal.deleteById(id);
 }

 public Datopersonal buscarDatopersonal(int id){
     //sino encuentra datos personales devuelve nulo o null
     Datopersonal datopersonal = rDatopersonal.findById(id).orElse(null);
     return datopersonal;
 }
 public void editarDatopersonal(Datopersonal datopersonal) {
        rDatopersonal.save(datopersonal);
    }
}
