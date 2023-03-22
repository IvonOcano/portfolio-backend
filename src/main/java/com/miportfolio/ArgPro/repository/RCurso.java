
package com.miportfolio.ArgPro.repository;

import com.miportfolio.ArgPro.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCurso extends JpaRepository<Curso, Integer>{
    
}
