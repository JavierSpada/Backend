/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JSpadaApplication.baseDatos.JSpada.service;

import com.JSpadaApplication.baseDatos.JSpada.model.Persona;
import com.JSpadaApplication.baseDatos.JSpada.repository.PersonaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author JavierS
 */
@Service
public class PersonaService {
    
    private PersonaRepository repository;
    
    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }

    public void agregarPersona(Persona pers) {
        repository.save(pers);
    }

    public List<Persona> verPersonas() {
        return repository.findAll();
    }

    public Persona obtenerPersona(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void borrarPersona(Long id) {
        repository.deleteById(id);
    }
}
