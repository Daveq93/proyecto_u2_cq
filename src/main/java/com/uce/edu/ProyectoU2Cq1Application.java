package com.uce.edu;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Persona;
import com.uce.edu.service.IEstudianteService;
import com.uce.edu.service.IPersonaJdbcService;
import com.uce.edu.service.IPersonaJpaService;
import com.uce.edu.to.Estudiante;
import com.uce.edu.to.PersonaTo;

@SpringBootApplication
public class ProyectoU2Cq1Application implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2Cq1Application.class);

	@Autowired
	private IPersonaJdbcService personaService;

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IPersonaJpaService personaJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2Cq1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola .... ");

		// taller 15 JDBC

		// PersonaTo per1 = new PersonaTo();
//		per1.setId(1);
//		per1.setNombre("Cristian");
//		per1.setApellido("Quizhpe");
//		per1.setCedula("1010101010");

		// insertar
		// this.personaService.insertarPersona(per1);

		// Actualizar
		PersonaTo per1Act = new PersonaTo();
		per1Act.setId(1);
		per1Act.setNombre("Cristian");
		per1Act.setApellido("Macas");
		per1Act.setCedula("1010101010");

		// this.personaService.actualizarPersona(per1);

		// eliminar
		// this.personaService.eliminarPorCedula("1010101010");

		// buscar
		// LOG.info(this.personaService.buscarPorCedula("1010101010"));

		// System.out.println("--------- TAREA 13 ----------");

		Estudiante e1 = new Estudiante();
		e1.setId(1);
		e1.setNombre("Paula");
		e1.setApellido("Robles");
		e1.setCedula("1313131313");
		e1.setEdad(20);

		// insertar
		// this.estudianteService.insertarEstudiante(e1);

		// Actualizar

		Estudiante e1Act = new Estudiante();
		e1Act.setId(1);
		e1Act.setNombre("Paula");
		e1Act.setApellido("Robles Vaca");
		e1Act.setCedula("1313131313");
		e1Act.setEdad(20);

		// this.estudianteService.actualizarEstudiante(e1Act);

		// Buscar por cedula

		// LOG.info(this.estudianteService.buscarPorCedula("1313131313"));

		// Eliminar por id

		// this.estudianteService.eliminarPorId(2);

		// taller 16

		PersonaTo per2 = new PersonaTo();
		per2.setId(2);
		per2.setNombre("Paula");
		per2.setApellido("Flores");
		per2.setCedula("1210121315");

		// insertar
		// this.personaService.insertarPersona(per2);

		// this.personaService.busarTodos().forEach(System.out::println);

		Persona per3 = new Persona();
		// per3.setId(2);
		per3.setNombre("Rocio");
		per3.setApellido("Albuja");
		per3.setCedula("1210120001");

		// this.personaJpaService.insertarPersona(per3);

		// Buscar por cedula
		// LOG.info(this.personaJpaService.buscarPorCedula("1210120001"));

		// Buscar todos
		// LOG.info(this.personaJpaService.busarTodos().toString());

		// Actualizar

		Persona per3Act = new Persona();
		per3Act.setId(4);
		per3Act.setNombre("RocioO");
		per3Act.setApellido("Albuja");
		per3Act.setCedula("1210120001");

		// this.personaJpaService.actualizarPersona(per3Act);
		// LOG.info(this.personaJpaService.buscarPorCedula("1210120001"));

		// Eliminar

		// this.personaJpaService.eliminarPorCedula("1210121315");

		Persona per4 = new Persona();
		// per3.setId(2);
		per4.setNombre("Juan");
		per4.setApellido("Robles");
		per4.setCedula("1210120009");

		// this.personaJpaService.insertarPersona(per4);

		// Taller 18

		Persona per5 = new Persona();
		per5.setNombre("Pedro");
		per5.setApellido("Robles");
		per5.setCedula("121012001515");
		per5.setGenero("M");

		// this.personaJpaService.insertarPersona(per5);

//		LOG.info(this.personaJpaService.buscarPorCedula("1210120009").toString());
//		
//		
//		
//		
//		List<Persona>  listaPer= this.personaJpaService.buscarPorApellido("Robles");
//		
//		for (Persona item : listaPer) {
//			LOG.info(item);
//		}
//		
//		
//		//Tarea
//		
//		LOG.info(this.personaJpaService.buscarPorGenero("M").toString());
//		
//		LOG.info(this.personaJpaService.buscarPorNombre("Juan").toString());

		System.out.println("----------------  TALLER 19  --------------");

		Persona per1 = new Persona();
		per1.setNombre("Andrea");
		per1.setApellido("Moran");
		per1.setCedula("1010101515");
		per1.setGenero("F");

		Persona per6 = new Persona();
		per6.setNombre("Karla");
		per6.setApellido("Mora");
		per6.setCedula("1010102018");
		per6.setGenero("F");

		// this.personaJpaService.insertarPersona(per1);
		// this.personaJpaService.insertarPersona(per6);

		 LOG.info(this.personaJpaService.actualizarPorApellido("FE", "Mora"));

		LOG.info(this.personaJpaService.eliminarPorGenero("FE"));

	}

}
