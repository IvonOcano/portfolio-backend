package com.miportfolio.ArgPro.controller;

import com.miportfolio.ArgPro.entity.Proyecto;
import com.miportfolio.ArgPro.service.SProyecto;
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
@RequestMapping("proyecto") 
@CrossOrigin(origins = "https://nuevoivonportf.web.app")

public class CProyecto {
    @Autowired
    SProyecto sProyecto;
    
    @GetMapping("/lista")
    @ResponseBody  
    public List <Proyecto> verProyectos(){
        return sProyecto.verProyectos();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
        return sProyecto.buscarProyecto(id);
    }
    @PostMapping ("/crear")
    public String agregarProyecto (@RequestBody Proyecto proyecto){
        sProyecto.crearProyecto(proyecto);
        return "El proyecto fue creado exitosamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String eliminarProyecto(@PathVariable int id){
        sProyecto.borrarProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    @PutMapping("/editar")
    public void updateProyecto(@RequestBody Proyecto proyecto){
        sProyecto.editarProyecto(proyecto);
    } 
}
