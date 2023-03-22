
package com.miportfolio.ArgPro.service;
import com.miportfolio.ArgPro.entity.Sobremi;
import com.miportfolio.ArgPro.repository.RSobremi;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSobremi {
   
@Autowired
 public RSobremi rSobremi;

 public List<Sobremi> verSobremi; 
 public List<Sobremi> verSobremi() { 
     List<Sobremi> listaSobremi= rSobremi.findAll();
 return listaSobremi;
 }
 
 public void crearSobremi(Sobremi sobremi){
     rSobremi.save(sobremi); 
 }
 
 public void borrarSobremi(int id){
     rSobremi.deleteById(id);
 }

 public Sobremi buscarSobremi(int id){
     Sobremi sobremi = rSobremi.findById(id).orElse(null);
     return sobremi;
 }
 
    public void editarSobremi(Sobremi sobremi) {
        rSobremi.save(sobremi);
    }
    
}
