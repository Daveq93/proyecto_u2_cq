package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Persona;
import com.uce.edu.repository.modelo.PersonaContadorGenero;
import com.uce.edu.repository.modelo.PersonaDTO;

public interface IPersonaJpaService {
	void insertarPersona(Persona persona);

	void actualizarPersona(Persona persona);

	Persona buscarPorCedula(String cedula);

	void eliminarPorCedula(String cedula);

	Persona buscarCedulaTyped(String cedula);

	Persona buscarCedulaNamed(String cedula);

	Persona buscarCedulaTypedNamed(String cedula);
	
	Persona buscarCedulaNative(String cedula);
	
	Persona buscarCedulaNamedNative(String cedula);
	
	Persona buscarCedulaCriteria(String cedula);

	List<Persona> busarTodos();

	Persona buscarId(Integer id);

	List<Persona> buscarPorApellido(String apellido);

	List<Persona> buscarPorGenero(String genero);

	List<Persona> buscarPorNombre(String nombre);

	public Integer actualizarPorApellido(String genero, String apellido);

	public Integer eliminarPorGenero(String genero);
	
	List<Persona> buscarPorNombreApellidoNamed(String nombre, String apellido);

	Persona buscarDinamicamente(String nombre, String apellido, String genero);
	
	List<Persona> buscarDinamicamentePredicado(String nombre,String apellido, String genero);

	List<PersonaDTO> buscarPorApellidoSencillo(String apellido);

	List<PersonaContadorGenero> contarPorGenero();

}
