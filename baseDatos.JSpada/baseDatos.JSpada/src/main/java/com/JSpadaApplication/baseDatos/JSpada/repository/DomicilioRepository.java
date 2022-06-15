
package com.JSpadaApplication.baseDatos.JSpada.repository;

import com.JSpadaApplication.baseDatos.JSpada.model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
    
}
