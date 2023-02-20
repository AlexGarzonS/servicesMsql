package com.holaMundo.co.HolaMundoData.web;

import com.holaMundo.co.HolaMundoData.Dao.PersonaDao;
import com.holaMundo.co.HolaMundoData.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@org.springframework.stereotype.Controller
public class Controller {
    
    @Autowired
    private PersonaDao personaDao;
    
    @GetMapping
    public String inicio(Model model)
    {
        Iterable<Persona> personas;
        personas = personaDao.findAll();
        
        model.addAttribute("personas",personas);
        return "index";
    }
    
}
