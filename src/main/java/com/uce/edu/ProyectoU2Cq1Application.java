package com.uce.edu;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.service.IEstudianteJpaService;
import com.uce.edu.service.IEstudianteService;
import com.uce.edu.service.IPersonaJdbcService;
import com.uce.edu.to.EstudianteTo;
import com.uce.edu.to.Persona;

@SpringBootApplication
public class ProyectoU2Cq1Application implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2Cq1Application.class);

	@Autowired
	private IPersonaJdbcService personaService;
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IEstudianteJpaService estudianteJpaService;
	

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
		
		EstudianteTo e1 = new EstudianteTo();
		e1.setId(1);
		e1.setNombre("Paula");
		e1.setApellido("Robles");
		e1.setCedula("1313131313");
		e1.setEdad(20);
		
		//insertar
		//this.estudianteService.insertarEstudiante(e1);
		
		
		//Actualizar
		
		EstudianteTo e1Act = new EstudianteTo();
		e1Act.setId(1);
		e1Act.setNombre("Paula");
		e1Act.setApellido("Robles Vaca");
		e1Act.setCedula("1313131313");
		e1Act.setEdad(20);
		
		//this.estudianteService.actualizarEstudiante(e1Act);
		
		//Buscar por cedula
		
		//LOG.info(this.estudianteService.buscarPorCedula("1313131313"));
		
		
		//Eliminar por id
		
		//this.estudianteService.eliminarPorId(2);

		System.out.println("--------  Tarea 14 --------------");
		
		Estudiante e2 = new Estudiante();
		e2.setId(2);
		e2.setNombre("Maria");
		e2.setApellido("Vaca");
		e2.setCedula("1515151515");
		e2.setEdad(25);
		
		Estudiante e3 = new Estudiante();
		e3.setId(3);
		e3.setNombre("Paul");
		e3.setApellido("Medina");
		e3.setCedula("1616161616");
		e3.setEdad(22);
		
		//Insertar
		this.estudianteJpaService.insertarEstudiante(e2);
		this.estudianteJpaService.insertarEstudiante(e3);
		
		Estudiante e3Act = new Estudiante();
		e3Act.setId(3);
		e3Act.setNombre("PaulX");
		e3Act.setApellido("MedinaN");
		e3Act.setCedula("1616161616");
		e3Act.setEdad(22);
		
		//Actualizar
		this.estudianteJpaService.actualizarEstudiante(e3Act);
		
		//Buscar
		LOG.info(this.estudianteJpaService.buscarPorCedula("1515151515"));
		
		//Eliminar
		this.estudianteJpaService.eliminarPorCedula("1616161616");
		
	}

}
