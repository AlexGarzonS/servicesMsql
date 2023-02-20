package com.holaMundo.co.HolaMundoData.Dao;

import com.holaMundo.co.HolaMundoData.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaDao extends CrudRepository<Persona, Long>
{
    
}
