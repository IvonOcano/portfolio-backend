
package com.miportfolio.ArgPro.repository;

import com.miportfolio.ArgPro.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository <Educacion, Integer>{
    
}
