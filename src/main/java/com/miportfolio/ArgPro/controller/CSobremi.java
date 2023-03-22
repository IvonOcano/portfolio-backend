package com.miportfolio.ArgPro.controller;
import com.miportfolio.ArgPro.entity.Sobremi;
import com.miportfolio.ArgPro.service.SSobremi;
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
@RequestMapping("sobremi") //localhost:8080/sobremi
@CrossOrigin(origins = "http://localhost:4200")
public class CSobremi {
    
    @Autowired
    SSobremi sSobremi;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Sobremi> verSobremi(){
        return sSobremi.verSobremi();
    }
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Sobremi verSobremi(@PathVariable int id){
        return sSobremi.buscarSobremi(id);
    }
    @PostMapping ("/crear")
    public String agregarSobremi (@RequestBody Sobremi sobremi){
        sSobremi.crearSobremi(sobremi);
        return "El texto sobremi fue creado exitosamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String eliminarSobremi(@PathVariable int id){
        sSobremi.borrarSobremi(id);
        return "El texto Sobremi fue eliminado correctamente";
    }
    //Otra forma de editar Sobremi
    @PutMapping("/editar")
    public void updateSobremi(@RequestBody Sobremi sobremi){
        sSobremi.editarSobremi(sobremi);
    }
}
