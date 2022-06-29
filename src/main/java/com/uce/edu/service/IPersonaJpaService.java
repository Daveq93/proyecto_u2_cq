package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Persona;

public interface IPersonaJpaService {
	void insertarPersona (Persona persona);
	void actualizarPersona(Persona persona);
	Persona buscarPorCedula(String cedula);
	void eliminarPorCedula(String cedula);
	
	List<Persona> busarTodos();
}
