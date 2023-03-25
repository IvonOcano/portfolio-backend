
package com.miportfolio.ArgPro.controller;

import com.miportfolio.ArgPro.entity.Curso;
import com.miportfolio.ArgPro.service.SCurso;
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
@RequestMapping("/curso") //https://nuevoivonportf.web.app
@CrossOrigin(origins = "https://nuevoivonportf.web.app/", allowedHeaders="*")

public class CCurso {
@Autowired
SCurso sCurso;

@GetMapping("/lista")
@ResponseBody 

public List <Curso> verCursos(){
        return sCurso.verCursos();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Curso verCurso(@PathVariable int id){
        return sCurso.buscarCurso(id);
    }
    @PostMapping ("/crear")
    public String agregarCurso (@RequestBody Curso curso){
        sCurso.crearCurso(curso);
        return "El curso fue creado exitosamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String eliminarCurso(@PathVariable int id){
        sCurso.borrarCurso(id);
        return "El curso fue eliminado correctamente";
    }
    
    
    @PutMapping("/editar")
    public void updateCurso(@RequestBody Curso curso){
        sCurso.editarCurso(curso);
         
    }

}
