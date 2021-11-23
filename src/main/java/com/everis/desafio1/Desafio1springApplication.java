package com.everis.desafio1;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Desafio1springApplication {

	public static void main(String[] args) {
		SpringApplication.run(Desafio1springApplication.class, args);
		
		ApplicationContext applicationContext = SpringApplication.run(Desafio1springApplication.class, args);
        AnadirPersonasService anadirPersonasService = applicationContext.getBean(AnadirPersonasService.class);
        anadirPersonasService.anadirPersonas(new Persona());
        
        ConsultarPersonasService consultarPersonasService = applicationContext.getBean(ConsultarPersonasService.class);
        consultarPersonasService.mostrarPersonas();
	}

}
