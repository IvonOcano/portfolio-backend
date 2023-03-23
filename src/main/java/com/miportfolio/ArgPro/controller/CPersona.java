package com.miportfolio.ArgPro.controller;
import com.miportfolio.ArgPro.entity.Persona;
import com.miportfolio.ArgPro.service.SPersona;
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
@RequestMapping("persona") //https://nuevoivonportf.web.app
@CrossOrigin(origins = "https://nuevoivonportf.web.app")
public class CPersona {
    @Autowired
    SPersona sPersona;
    
    @GetMapping("/lista") 
    @ResponseBody
    public List <Persona> verPersonas(){
        return sPersona.verPersonas();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return sPersona.buscarPersona(id);
    }
    @PostMapping ("/crear")
    public String agregarPersona (@RequestBody Persona persona){
        sPersona.crearPersona(persona);
        return "La persona fue creada exitosamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id){
        sPersona.borrarPersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    //Otra forma de editar persona
    @PutMapping("/editar")
    public void updatePersona(@RequestBody Persona persona){
        sPersona.editarPersona(persona);
    }
    
    //login
    @PostMapping ("/login")
    public Persona loginPersona(@RequestBody Persona persona) {
        return sPersona.loginPersona(persona.getEmail(), persona.getPassword());
    }
}
