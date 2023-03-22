
package com.miportfolio.ArgPro.repository;

import com.miportfolio.ArgPro.entity.Datopersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RDatopersonal extends JpaRepository<Datopersonal, Integer>{
    
}
