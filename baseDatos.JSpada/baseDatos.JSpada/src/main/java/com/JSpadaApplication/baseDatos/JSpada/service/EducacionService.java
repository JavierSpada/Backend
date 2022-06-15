
package com.JSpadaApplication.baseDatos.JSpada.service;

import com.JSpadaApplication.baseDatos.JSpada.model.Educacion;
import com.JSpadaApplication.baseDatos.JSpada.repository.EducacionRepository;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class EducacionService {
    
     private EducacionRepository repository;
    
    public EducacionService(EducacionRepository repository) {
        this.repository = repository;
    }

    public void agregarEducacion(Educacion educ) {
        repository.save(educ);
    }

    public List<Educacion> verEducacion() {
        return repository.findAll();
    }

    public Educacion obtenerEducacion(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void borrarEducacion(Long id) {
        repository.deleteById(id);
    }
    
}
