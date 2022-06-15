
package com.JSpadaApplication.baseDatos.JSpada.service;

import com.JSpadaApplication.baseDatos.JSpada.model.Habilidades;
import com.JSpadaApplication.baseDatos.JSpada.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService {
    
     private HabilidadesRepository repository;
     
     public HabilidadesService(HabilidadesRepository repository) {
        this.repository = repository;
    }
     
    public void agregarHabilidades(Habilidades habi) {
         repository.save(habi);
    }
    
    public Habilidades obtenerHabilidades(Long id) {
        return repository.findById(id).orElse(null);
    }
    

    public List<Habilidades> verHabilidades() {
        return repository.findAll();
    }
       

    public void borrarHabilidades(Long id) {
       repository.deleteById(id);
    }
    
}
