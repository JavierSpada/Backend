
package com.JSpadaApplication.baseDatos.JSpada.Controller;

import com.JSpadaApplication.baseDatos.JSpada.model.Educacion;
import com.JSpadaApplication.baseDatos.JSpada.service.EducacionService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/educacion")
public class EducacionController {
    
     private EducacionService educacionService;
    
    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    
}
    @GetMapping ("/{id}")
    public Educacion obtenerEducacion(@PathVariable Long id){
        return educacionService.obtenerEducacion(id);
    }
    
    @PostMapping
    public void agregarEducacion (@RequestBody Educacion educ) {
        educacionService.agregarEducacion(educ);
    }
    
    @GetMapping
    public List<Educacion> verEducacion (){
        return educacionService.verEducacion();
    }
    
    @DeleteMapping("/{id}")
    public void deleteEducacion (@PathVariable Long id){
        educacionService.borrarEducacion(id);
    }
    
}
