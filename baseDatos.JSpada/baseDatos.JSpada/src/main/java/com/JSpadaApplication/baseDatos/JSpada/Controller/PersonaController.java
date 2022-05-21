
package com.JSpadaApplication.baseDatos.JSpada.Controller;

import com.JSpadaApplication.baseDatos.JSpada.model.Persona;
import com.JSpadaApplication.baseDatos.JSpada.service.PersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    
    private PersonaService personaService;
    
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    } 
    
    @GetMapping ("/{id}")
    public Persona obtenerPersona(@PathVariable Long id){
        return personaService.obtenerPersona(id);
    }
    
    @PostMapping
    public void agregarPersona (@RequestBody Persona pers) {
        personaService.agregarPersona(pers);
    }
    
    @GetMapping
    public List<Persona> verPersonas (){
        return personaService.verPersonas();
    }
    
    @DeleteMapping("/{id}")
    public void deletePersona (@PathVariable Long id){
        personaService.borrarPersona(id);
    }
}
