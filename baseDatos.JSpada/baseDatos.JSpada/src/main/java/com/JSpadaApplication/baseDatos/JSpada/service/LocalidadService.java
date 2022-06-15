
package com.JSpadaApplication.baseDatos.JSpada.service;

import com.JSpadaApplication.baseDatos.JSpada.model.Localidad;
import com.JSpadaApplication.baseDatos.JSpada.repository.LocalidadRepository;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class LocalidadService {
    
     private final LocalidadRepository repository;

     public LocalidadService(LocalidadRepository repository) {
        this.repository = repository;
    }
     
    public Localidad obtenerLocalidad(Long id) {
        return repository.findById(id).orElse(null);
        
    } 

    public void agregarLocalidad(Localidad local) {
         repository.save(local);
    }

    public List<Localidad> verLocalidad() {
         return repository.findAll();
    }

    public void borrarLocalidad(Long id) {
       repository.deleteById(id);
    }
    
}
