
package com.JSpadaApplication.baseDatos.JSpada.Controller;

import com.JSpadaApplication.baseDatos.JSpada.model.Habilidades;
import com.JSpadaApplication.baseDatos.JSpada.service.HabilidadesService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {
    
     private final HabilidadesService habilidadesService;
    
    public HabilidadesController(HabilidadesService habilidadesService) {
        this.habilidadesService = habilidadesService;
    
}
    @GetMapping ("/{id}")
    public Habilidades obtenerHabilidades(@PathVariable Long id){
        return habilidadesdService.obtenerHabilidades(id);
    }
    
    @PostMapping
    public void agregarHabilidades (@RequestBody Habilidades local) {
        habilidadesService.agregarHabilidades(local);
    }
    
    @GetMapping
    public List<Habilidades> verHabilidades (){
        return habilidadesService.verHabilidades();
    }
    
    @DeleteMapping("/{id}")
    public void deleteHabilidades (@PathVariable Long id){
        habilidadesService.borrarHabilidades(id);  
    }
}
