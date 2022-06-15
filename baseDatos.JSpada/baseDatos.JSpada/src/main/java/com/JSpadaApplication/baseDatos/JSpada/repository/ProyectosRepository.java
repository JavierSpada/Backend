
package com.JSpadaApplication.baseDatos.JSpada.repository;

import com.JSpadaApplication.baseDatos.JSpada.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectosRepository  extends JpaRepository<Proyectos, Long> {
}
