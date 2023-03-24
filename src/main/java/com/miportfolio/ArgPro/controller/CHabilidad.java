
package com.miportfolio.ArgPro.controller;

import com.miportfolio.ArgPro.entity.Habilidad;
import com.miportfolio.ArgPro.service.SHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidad") //https://nuevoivonportf.web.app
@CrossOrigin(origins = "https://nuevoivonportf.web.app")
public class CHabilidad {
    
    @Autowired
SHabilidad sHabilidad;

@GetMapping("/lista")
@ResponseBody 

public List <Habilidad> verHabilidades(){
        return sHabilidad.verHabilidades();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Habilidad verHabilidad(@PathVariable int id){
        return sHabilidad.buscarHabilidad(id);
    }
    @PostMapping ("/crear")
    public String agregarHabilidad(@RequestBody Habilidad habilidad){
        sHabilidad.crearHabilidad(habilidad);
        return "La habilidad fué creada exitosamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String eliminarHabilidad(@PathVariable int id){
        sHabilidad.borrarHabilidad(id);
        return "La habilidad fué eliminada correctamente";
    }
    
    
    @PutMapping("/editar")
    public void updateHabilidad(@RequestBody Habilidad habilidad){
        sHabilidad.editarHabilidad(habilidad);
    }
}
