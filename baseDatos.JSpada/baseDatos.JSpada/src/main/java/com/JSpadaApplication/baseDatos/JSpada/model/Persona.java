
package com.JSpadaApplication.baseDatos.JSpada.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter  
@Setter
public class Persona {
    
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String acercaDe;
    private String urlFotoPerfil;
   
    
}

