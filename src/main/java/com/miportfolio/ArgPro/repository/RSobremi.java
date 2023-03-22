
package com.miportfolio.ArgPro.repository;

import com.miportfolio.ArgPro.entity.Sobremi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSobremi extends JpaRepository <Sobremi, Integer> {
    
     //se pueden declarar métodos extras
}
