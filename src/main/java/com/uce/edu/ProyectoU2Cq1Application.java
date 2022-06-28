package com.uce.edu;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.service.IEstudianteService;
import com.uce.edu.service.IPersonaJdbcService;
import com.uce.edu.to.Estudiante;
import com.uce.edu.to.Persona;

@SpringBootApplication
public class ProyectoU2Cq1Application implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2Cq1Application.class);

	@Autowired
	private IPersonaJdbcService personaService;
	
	@Autowired
	private IEstudianteService estudianteService;
	

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
		//LOG.info(this.personaService.buscarPorCedula("1010101010"));
		
		
		System.out.println("--------- TAREA 13 ----------");
		
		Estudiante e1 = new Estudiante();
		e1.setId(1);
		e1.setNombre("Paula");
		e1.setApellido("Robles");
		e1.setCedula("1313131313");
		e1.setEdad(20);
		
		//insertar
		this.estudianteService.insertarEstudiante(e1);
		
		
		//Actualizar
		
		Estudiante e1Act = new Estudiante();
		e1Act.setId(1);
		e1Act.setNombre("Paula");
		e1Act.setApellido("Robles Vaca");
		e1Act.setCedula("1313131313");
		e1Act.setEdad(20);
		
		this.estudianteService.actualizarEstudiante(e1Act);
		
		//Buscar por cedula
		
		LOG.info(this.estudianteService.buscarPorCedula("1313131313"));
		
		
		//Eliminar por id
		
		this.estudianteService.eliminarPorId(2);

	}

}
