package com.everis.desafio1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnadirPersonasService {

	@Autowired
    private PersonaRepositorio personaRepositorio;
 
    public AnadirPersonasService(PersonaRepositorio personaRepositorio) {
        this.personaRepositorio = personaRepositorio;
    }
 
    public List<Persona> anadirPersonas(Persona persona) {
         personaRepositorio.listaPersona.add(persona);
         
         return personaRepositorio.listaPersona;
    }
	
}
