
package com.JSpadaApplication.baseDatos.JSpada.repository;

import com.JSpadaApplication.baseDatos.JSpada.model.Localidad;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Long>{
    
}
