
package com.JSpadaApplication.baseDatos.JSpada.Controller;

import com.JSpadaApplication.baseDatos.JSpada.model.Proyectos;
import com.JSpadaApplication.baseDatos.JSpada.service.ProyectosService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    
       private ProyectosService proyectosService;
    
    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    
}
    @GetMapping ("/{id}")
    public Proyectos obtenerProyectos(@PathVariable Long id){
        return proyectosService.obtenerProyectos(id);
    }
    
     @GetMapping
    public List<Proyectos> verProyectos (){
        return proyectosService.verProyectos();
    }
    
    
}
