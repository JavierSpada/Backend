
package com.JSpadaApplication.baseDatos.JSpada.repository;

import com.JSpadaApplication.baseDatos.JSpada.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository  extends JpaRepository<Habilidades, Long>{
    
}
