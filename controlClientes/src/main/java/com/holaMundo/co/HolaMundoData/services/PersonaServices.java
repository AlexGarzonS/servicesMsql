package com.holaMundo.co.HolaMundoData.services;

import com.holaMundo.co.HolaMundoData.domain.Persona;
import java.util.List;

public interface PersonaServices 
{
 
    public List<Persona> listaPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public void encontrarPersona(Persona persona);
    
}
