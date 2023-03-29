
package com.miportfolio.ArgPro.controller;

import com.miportfolio.ArgPro.entity.Experiencia;
import com.miportfolio.ArgPro.service.SExperiencia;
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
@RequestMapping("experiencia") 
@CrossOrigin(origins = "https://nuevoivonportf.web.app", allowedHeaders="*")

public class CExperiencia {
    @Autowired
    SExperiencia sExperiencia;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Experiencia> verExperiencias(){
        return sExperiencia.verExperiencias();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id){
        return sExperiencia.buscarExperiencia(id);
    }
    @PostMapping ("/crear")
    public String agregarExperiencia (@RequestBody Experiencia experiencia){
        sExperiencia.crearExperiencia(experiencia);
        return "La experiencia fue creada exitosamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable int id){
        sExperiencia.borrarExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }
    
    //Otra forma de editar experiencia
    @PutMapping("/editar")
    public void updateExperiencia(@RequestBody Experiencia experiencia){
        sExperiencia.editarExperiencia(experiencia);
    }

}
