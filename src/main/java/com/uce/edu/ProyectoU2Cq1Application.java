package com.uce.edu;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.service.IPersonaJdbcService;
import com.uce.edu.to.Persona;

@SpringBootApplication
public class ProyectoU2Cq1Application implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2Cq1Application.class);

	@Autowired
	private IPersonaJdbcService personaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2Cq1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola .... ");

		// taller 15 JDBC

		Persona per1 = new Persona();
		per1.setId(1);
		per1.setNombre("Cristian");
		per1.setApellido("Quizhpe");
		per1.setCedula("1010101010");

		// insertar
		// this.personaService.insertarPersona(per1);

		// Actualizar
		Persona per1Act = new Persona();
		per1Act.setId(1);
		per1Act.setNombre("Cristian");
		per1Act.setApellido("Macas");
		per1Act.setCedula("1010101010");

		// this.personaService.actualizarPersona(per1);

		
		//eliminar
		// this.personaService.eliminarPorCedula("1010101010");

		
		//buscar
		LOG.info(this.personaService.buscarPorCedula("1010101010"));

	}

}
