
package com.JSpadaApplication.baseDatos.JSpada.service;

import com.JSpadaApplication.baseDatos.JSpada.model.ExperienciaLaboral;
import com.JSpadaApplication.baseDatos.JSpada.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService {
    
    private ExperienciaLaboralRepository repository;
    
      public ExperienciaLaboralService(ExperienciaLaboralRepository repository) {
        this.repository = repository;
    }

    public void agregarExperienciaLaboral(ExperienciaLaboral experlab) {
        repository.save(experlab);
    }

    public List<ExperienciaLaboral> verExperienciaLaboral() {
        return repository.findAll();
    }

    public ExperienciaLaboral obtenerExperienciaLaboral(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void borrarExperienciaLaboral(Long id) {
        repository.deleteById(id);
    }
    
}
