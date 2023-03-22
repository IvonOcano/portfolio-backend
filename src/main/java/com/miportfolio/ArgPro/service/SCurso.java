
package com.miportfolio.ArgPro.service;

import com.miportfolio.ArgPro.entity.Curso;
import com.miportfolio.ArgPro.repository.RCurso;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SCurso {
@Autowired
  public RCurso rCurso;

public List<Curso> verCursos() { 
     List<Curso> listaCursos= rCurso.findAll();
 return listaCursos;
 }
 
 public void crearCurso(Curso curso){
     rCurso.save(curso); 
 }
 
 public void borrarCurso(int id){
     rCurso.deleteById(id);
 }

 public Curso buscarCurso(int id){
     //sino encuentra el curso devuelve nulo o null
     Curso curso = rCurso.findById(id).orElse(null);
     return curso;
 }
 public void editarCurso(Curso curso) {
        rCurso.save(curso);
    }

}
