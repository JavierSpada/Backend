
package com.JSpadaApplication.baseDatos.JSpada.Controller;

import com.JSpadaApplication.baseDatos.JSpada.model.Localidad;
import com.JSpadaApplication.baseDatos.JSpada.service.LocalidadService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/localidad")
public class LocalidadController {
    
     private final LocalidadService localidadService;
    
    public LocalidadController(LocalidadService localidadService) {
        this.localidadService = localidadService;
    
}
    @GetMapping ("/{id}")
    public Localidad obtenerLocalidad(@PathVariable Long id){
        return localidadService.obtenerLocalidad(id);
    }
    
    @PostMapping
    public void agregarLocalidad (@RequestBody Localidad local) {
        localidadService.agregarLocalidad(local);
    }
    
    @GetMapping
    public List<Localidad> verLocalidad (){
        return localidadService.verLocalidad();
    }
    
    @DeleteMapping("/{id}")
    public void deleteLocalidad (@PathVariable Long id){
        localidadService.borrarLocalidad(id);
    }
}
