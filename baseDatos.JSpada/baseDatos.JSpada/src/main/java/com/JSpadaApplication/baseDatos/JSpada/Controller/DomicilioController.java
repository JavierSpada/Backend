
package com.JSpadaApplication.baseDatos.JSpada.Controller;

import com.JSpadaApplication.baseDatos.JSpada.model.Domicilio;
import com.JSpadaApplication.baseDatos.JSpada.service.DomicilioService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/domicilio")
public class DomicilioController {
    
     private final DomicilioService domicilioService;
    
    public DomicilioController(DomicilioService domicilioService) {
        this.domicilioService = domicilioService;
    
}
    @GetMapping ("/{id}")
    public Domicilio obtenerDomicilio(@PathVariable Long id){
        return domicilioService.obtenerDomicilio(id);
    }
    
     @GetMapping
    public List<Domicilio> verDomicilio (){
        return domicilioService.verDomicilio();
    }
    
}
