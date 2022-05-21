/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JSpadaApplication.baseDatos.JSpada.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author JavierS
 */
@Entity
@Getter  
@Setter
public class ExperienciaLaboral {
    
    @Id
    private Long id;
    private String nombre;
    

}
