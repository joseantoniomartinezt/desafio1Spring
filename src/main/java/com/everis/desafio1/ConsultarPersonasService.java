package com.everis.desafio1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultarPersonasService {

	@Autowired
    private PersonaRepositorio personaRepositorio;
 
    public ConsultarPersonasService(PersonaRepositorio personaRepositorio) {
        this.personaRepositorio = personaRepositorio;
    }
 
    public void mostrarPersonas() {
    	for(int ind=0;ind<personaRepositorio.listaPersona.size();ind++) {
    		System.out.println(personaRepositorio.listaPersona.get(ind));
    	}
    }
	
}
