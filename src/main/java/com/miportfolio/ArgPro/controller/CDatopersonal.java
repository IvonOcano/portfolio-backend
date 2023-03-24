
package com.miportfolio.ArgPro.controller;

import com.miportfolio.ArgPro.entity.Datopersonal;
import com.miportfolio.ArgPro.service.SDatopersonal;
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
@RequestMapping("/datopersonal") //https://nuevoivonportf.web.app/
@CrossOrigin(origins = "https://nuevoivonportf.web.app")
public class CDatopersonal {

    @Autowired
SDatopersonal sDatopersonal;

@GetMapping("/lista")
@ResponseBody 

public List <Datopersonal> verDatospersonales(){
        return sDatopersonal.verDatospersonales();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Datopersonal verDatopersonal(@PathVariable int id){
        return sDatopersonal.buscarDatopersonal(id);
    }
    @PostMapping ("/crear")
    public String agregarDatopersonal(@RequestBody Datopersonal datopersonal){
        sDatopersonal.crearDatopersonal(datopersonal);
        return "Los datos personales fueron creados exitosamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String eliminarDatopersonal(@PathVariable int id){
        sDatopersonal.borrarDatopersonal(id);
        return "Los datos personales fueron eliminados correctamente";
    }
    
    
    @PutMapping("/editar")
    public void updateDatopersonal(@RequestBody Datopersonal datopersonal){
        sDatopersonal.editarDatopersonal(datopersonal);
         
    }
}
