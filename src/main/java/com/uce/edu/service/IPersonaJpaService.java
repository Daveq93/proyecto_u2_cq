package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Persona;

public interface IPersonaJpaService {
	void insertarPersona (Persona persona);
	void actualizarPersona(Persona persona);
	Persona buscarPorCedula(String cedula);
	void eliminarPorCedula(String cedula);
	
	List<Persona> busarTodos();
	
	Persona buscarId(Integer id);
	List<Persona> buscarPorApellido(String apellido);
	List<Persona> buscarPorGenero(String genero);
	List<Persona>buscarPorNombre(String nombre);
	
	public Integer actualizarPorApellido(String genero,String apellido);
	public Integer eliminarPorGenero(String genero);
}
