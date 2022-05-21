/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JSpadaApplication.baseDatos.JSpada.repository;

import com.JSpadaApplication.baseDatos.JSpada.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author JavierS
 */
public interface PersonaRepository  extends JpaRepository<Persona, Long> {
    
}
