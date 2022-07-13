package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.prueba.modelo.Propietario;
import com.uce.edu.prueba.modelo.Vehiculo;
import com.uce.edu.prueba.service.IGestorMatriculaService;
import com.uce.edu.prueba.service.IPropietarioService;
import com.uce.edu.prueba.service.IVehiculoService;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository.modelo.Persona;
import com.uce.edu.service.IEstudianteService;
import com.uce.edu.service.IPersonaJdbcService;
import com.uce.edu.service.IPersonaJpaService;
import com.uce.edu.to.EstudianteTo;
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

	@Autowired
	private IGestorMatriculaService gestorMatriculaService;

	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private IVehiculoService vehiculoService;

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

//		EstudianteTo e1 = new EstudianteTo();
//		e1.setId(1);
//		e1.setNombre("Paula");
//		e1.setApellido("Robles");
//		e1.setCedula("1313131313");
//		e1.setEdad(20);

		// insertar
		// this.estudianteService.insertarEstudiante(e1);

		// Actualizar

		EstudianteTo e1Act = new EstudianteTo();
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

		// LOG.info(this.personaJpaService.actualizarPorApellido("FE", "Mora"));

		// LOG.info(this.personaJpaService.eliminarPorGenero("FE"));

		System.out.println("----------- TAREA 16  --------------");

		Vehiculo v = new Vehiculo();
		v.setMarca("Mazda");
		v.setPlaca("ASB-1245");
		v.setPrecio(new BigDecimal(25000));
		v.setTipo("L");

		// 1. crear un vehiculo
		// this.vehiculoService.insertarVehiculo(v);

		// Actualizar
		v.setMarca("Mazda-X");
		// this.vehiculoService.actualizarVehiculo(v);

		Propietario p1 = new Propietario();
		p1.setApellido("Quizhpe");
		p1.setCedula("1105353889");
		p1.setFechaNacimiento(LocalDateTime.of(2000, Month.DECEMBER, 15, 0, 0));
		p1.setNombre("Cristian");

		// insertar propietario
		// this.propietarioService.insertarPropietario(p1);

		// crear matricula
		// this.gestorMatriculaService.matricularVehiculo("1105353889","ASB-1245");

		System.out.println("--------------- Taller 20 -------------");

		Persona per7 = new Persona();
		per7.setNombre("Pedro");
		per7.setApellido("Robles");
		per7.setCedula("1105161819");
		per7.setGenero("M");

		// this.personaJpaService.insertarPersona(per7);

//		LOG.info(this.personaJpaService.buscarCedulaNamed("1210120009"));
//		LOG.info(this.personaJpaService.buscarCedulaTyped("121012001515"));
//		LOG.info(this.personaJpaService.buscarCedulaTypedNamed("1010101515"));
//		
//		List<Persona> listaPersonas = this.personaJpaService.buscarPorNombreApellidoNamed("Pedro", "Robles");
//		
//	    for (Persona per : listaPersonas) {
//			LOG.info(per);
//		}
//		

		System.out.println("-------------- TAREA 17 ---------------------");

		Estudiante e1 = new Estudiante();
		e1.setApellido("Corral");
		e1.setCedula("1215489870");
		e1.setEdad(18);
		e1.setNombre("Ana");
		e1.setSemestre("Segundo");

		Estudiante e2 = new Estudiante();
		e2.setApellido("Vinueza");
		e2.setCedula("1598612987");
		e2.setEdad(19);
		e2.setNombre("Maria");
		e2.setSemestre("Segundo");

		Estudiante e3 = new Estudiante();
		e3.setApellido("Zapata");
		e3.setCedula("1980032157");
		e3.setEdad(20);
		e3.setNombre("Pedro");
		e3.setSemestre("Tercero");

		Estudiante e4 = new Estudiante();
		e4.setApellido("Ruiz");
		e4.setCedula("1980014499");
		e4.setEdad(18);
		e4.setNombre("Karen");
		e4.setSemestre("Segundo");

//	this.estudianteService.insertar(e1);
//	this.estudianteService.insertar(e2);
//	this.estudianteService.insertar(e3);
//	this.estudianteService.insertar(e4);

		

//		LOG.info(this.estudianteService.buscarPorCedulaTyped("1980014499"));
//
//		List<Estudiante> lista1 = this.estudianteService.buscarMenoresTyped(20);
//		for (Estudiante estu : lista1) {
//			LOG.info(estu);
//		}
//
//		List<Estudiante> lista2 = this.estudianteService.buscarporSemestreNamed("Segundo");
//		for (Estudiante estu : lista2) {
//			LOG.info(estu);
//		}
//		
//		List<Estudiante> lista3 = this.estudianteService.buscarPorNombreApellidoNamed("maria","Vinueza" );
//		for (Estudiante estu : lista3) {
//			LOG.info(estu);
//		}
//		
//		List<Estudiante> lista4 = this.estudianteService.buscarPorSemestreTypedNamed("Tercero");
//		for (Estudiante estu : lista4) {
//			LOG.info(estu);
//		}
//
//		List<Estudiante> lista5 = this.estudianteService.buscarPorApellidoMenoresATypedNamed("Ruiz", 19);
//		for (Estudiante estu : lista5) {
//			LOG.info(estu);
//		}
		
		
		System.out.println("------------- TALLER 21 -----------------");
		
		LOG.info(this.personaJpaService.buscarCedulaNative("1105161819"));
		
		LOG.info(this.personaJpaService.buscarCedulaNamedNative("1105161819"));
		
		LOG.info(this.personaJpaService.buscarCedulaCriteria("1105161819"));
	}

}
