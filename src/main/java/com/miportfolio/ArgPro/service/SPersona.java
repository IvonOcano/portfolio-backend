
package com.miportfolio.ArgPro.service;
import com.miportfolio.ArgPro.entity.Persona;
import com.miportfolio.ArgPro.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
 @Autowired
 public RPersona rPersona;
 
 public List<Persona> verPersonas; 
 public List<Persona> verPersonas() { 
     List<Persona> listaPersonas= rPersona.findAll();
 return listaPersonas;
 }
 
 public void crearPersona(Persona persona){
     rPersona.save(persona); 
 }
 
 public void borrarPersona(int id){
     rPersona.deleteById(id);
 }

 public Persona buscarPersona(int id){
     //sino encuentra la persona devuelve nulo o null
     Persona persona = rPersona.findById(id).orElse(null);
     return persona;
 }

    public void editarPersona(Persona persona) {
        rPersona.save(persona);
    }
    
    public Persona loginPersona(String email, String password) {
        List <Persona> personas = rPersona.findByEmailAndPassword(email, password);
        if(!personas.isEmpty()){
            return personas.get(0); 
        }
        return null;
    }
    
}
