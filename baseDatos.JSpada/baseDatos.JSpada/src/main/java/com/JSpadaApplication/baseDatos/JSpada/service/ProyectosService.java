
package com.JSpadaApplication.baseDatos.JSpada.service;

import com.JSpadaApplication.baseDatos.JSpada.model.Proyectos;
import com.JSpadaApplication.baseDatos.JSpada.repository.ProyectosRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService {
    
     private ProyectosRepository repository;
    
    public ProyectosService(ProyectosRepository repository) {
        this.repository = repository;
    }

    public Proyectos obtenerProyectos(Long id) {
        return repository.findById(id).orElse(null);
    }
        
    public List<Proyectos> verProyectos() {
       return repository.findAll();
    }
    
}
