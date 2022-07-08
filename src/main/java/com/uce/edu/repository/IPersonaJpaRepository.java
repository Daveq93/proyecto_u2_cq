package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Persona;

public interface IPersonaJpaRepository {
	void insertar(Persona persona);

	void actualizar(Persona persona);

	Persona buscarCedula(String cedula);
	
	

	void eliminar(String cedula);

	List<Persona> busarTodos();
	
	Persona buscarId(Integer id);
	List<Persona> buscarPorApellido(String apellido);
	List<Persona> buscarPorGenero(String genero);
	List<Persona>buscarPorNombre(String nombre);
}
