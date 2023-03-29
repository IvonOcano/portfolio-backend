
package com.miportfolio.ArgPro.controller;

import com.miportfolio.ArgPro.entity.Red;
import com.miportfolio.ArgPro.service.SRed;
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
@RequestMapping("red") 
@CrossOrigin(origins = "https://nuevoivonportf.web.app", allowedHeaders="*")

public class CRed {
    @Autowired
SRed sRed;

@GetMapping("/lista")
@ResponseBody 

public List <Red> verRedes(){
        return sRed.verRedes();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Red verRed(@PathVariable int id){
        return sRed.buscarRed(id);
    }
    @PostMapping ("/crear")
    public String agregarRed (@RequestBody Red red){
        sRed.crearRed(red);
        return "La red fue creada exitosamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String eliminarRed(@PathVariable int id){
        sRed.borrarRed(id);
        return "La red fue eliminada correctamente";
    }
    
    
    @PutMapping("/editar")
    public void updateCurso(@RequestBody Red red){
        sRed.editarRed(red);
    }
}
