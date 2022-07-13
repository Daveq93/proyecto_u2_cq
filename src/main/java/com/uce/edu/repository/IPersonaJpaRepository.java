package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Persona;

public interface IPersonaJpaRepository {
	void insertar(Persona persona);

	void actualizar(Persona persona);

	Persona buscarCedula(String cedula);

	Persona buscarCedulaTyped(String cedula);

	Persona buscarCedulaNamed(String cedula);

	Persona buscarCedulaTypedNamed(String cedula);
	Persona buscarCedulaNative(String cedula);
	Persona buscarCedulaNamedNative(String cedula);
	
	Persona buscarCedulaCriteria(String cedula);

	void eliminar(String cedula);

	List<Persona> busarTodos();

	Persona buscarId(Integer id);

	List<Persona> buscarPorApellido(String apellido);

	List<Persona> buscarPorGenero(String genero);

	List<Persona> buscarPorNombre(String nombre);

	 Integer actualizarPorApellido(String genero, String apellido);

	 Integer eliminarPorGenero(String genero);
	 
	 List<Persona> buscarPorNombreApellidoNamed(String nombre, String apellido);



}
