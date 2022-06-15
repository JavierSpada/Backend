
package com.JSpadaApplication.baseDatos.JSpada.service;

import com.JSpadaApplication.baseDatos.JSpada.model.Domicilio;
import com.JSpadaApplication.baseDatos.JSpada.repository.DomicilioRepository;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class DomicilioService {
    
     private final DomicilioRepository repository;
     
      public DomicilioService(DomicilioRepository repository) {
        this.repository = repository;
    }

    public Domicilio obtenerDomicilio(Long id) {
       return repository.findById(id).orElse(null);
    }

    public List<Domicilio> verDomicilio() {
        return repository.findAll();
    }
    
}
