
package com.JSpadaApplication.baseDatos.JSpada.Controller;

import com.JSpadaApplication.baseDatos.JSpada.model.ExperienciaLaboral;
import com.JSpadaApplication.baseDatos.JSpada.service.ExperienciaLaboralService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/experienciaLaboral")
@CrossOrigin(origins = "*")
public class ExperienciaLaboralController {
     private ExperienciaLaboralService experienciaLaboralService;
    
    public ExperienciaLaboralController(ExperienciaLaboralService experienciaLaboralService) {
        this.experienciaLaboralService = experienciaLaboralService;
    
}
    @GetMapping ("/{id}")
    public ExperienciaLaboral obtenerExperienciaLaboral(@PathVariable Long id){
        return experienciaLaboralService.obtenerExperienciaLaboral(id);
    }
    
    @PostMapping
    public void agregarExperienciaLaboral (@RequestBody ExperienciaLaboral experlab) {
        experienciaLaboralService.agregarExperienciaLaboral(experlab);
    }
    
    @GetMapping
    public List<ExperienciaLaboral> verExperienciaLaboral (){
        return experienciaLaboralService.verExperienciaLaboral();
    }
    
    @DeleteMapping("/{id}")
    public void deleteExperienciaLaboral (@PathVariable Long id){
        experienciaLaboralService.borrarExperienciaLaboral(id);
    }
}
