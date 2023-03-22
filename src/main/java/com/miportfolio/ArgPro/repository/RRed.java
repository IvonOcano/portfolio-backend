
package com.miportfolio.ArgPro.repository;

import com.miportfolio.ArgPro.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRed extends JpaRepository<Red, Integer>{
    
}
