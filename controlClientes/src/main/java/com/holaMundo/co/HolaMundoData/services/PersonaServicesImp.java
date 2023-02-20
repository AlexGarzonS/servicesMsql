package com.holaMundo.co.HolaMundoData.services;

import com.holaMundo.co.HolaMundoData.Dao.PersonaDao;
import com.holaMundo.co.HolaMundoData.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicesImp implements PersonaServices
{
    @Autowired
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listaPersonas() 
    {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    public void guardar(Persona persona) 
    {
        personaDao.save(persona);
    }

    @Override
    public void eliminar(Persona persona) 
    {
        personaDao.delete(persona);
    }

    @Override
    public void encontrarPersona(Persona persona) 
    {
        personaDao.findById(persona.getId_persona());
    }
    
}
