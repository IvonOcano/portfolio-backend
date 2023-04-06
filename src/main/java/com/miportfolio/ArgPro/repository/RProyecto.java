package com.miportfolio.ArgPro.repository;

import com.miportfolio.ArgPro.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository <Proyecto, Integer>{
    
}
