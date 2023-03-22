
package com.miportfolio.ArgPro.repository;

import com.miportfolio.ArgPro.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Integer>{
    public List<Persona> findByEmailAndPassword(String email, String password);
    
}
