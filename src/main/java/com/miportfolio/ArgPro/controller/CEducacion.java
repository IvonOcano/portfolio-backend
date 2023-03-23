package com.miportfolio.ArgPro.controller;

import com.miportfolio.ArgPro.entity.Educacion;
import com.miportfolio.ArgPro.service.SEducacion;
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
@RequestMapping("educacion") //https://nuevoivonportf.web.app/
@CrossOrigin(origins = "https://nuevoivonportf.web.app")
public class CEducacion {
   @Autowired
    SEducacion sEducacion;
    
    @GetMapping("/lista")
    @ResponseBody  
    public List <Educacion> verEducaciones(){
        return sEducacion.verEducaciones();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Educacion verEducacion(@PathVariable int id){
        return sEducacion.buscarEducacion(id);
    }
    @PostMapping ("/crear")
    public String agregarEducacion (@RequestBody Educacion educacion){
        sEducacion.crearEducacion(educacion);
        return "La educacion fue creada exitosamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String eliminarEducacion(@PathVariable int id){
        sEducacion.borrarEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    //Otra forma de editar educacion
    @PutMapping("/editar")
    public void updateEducacion(@RequestBody Educacion educacion){
        sEducacion.editarEducacion(educacion);
    }

}
