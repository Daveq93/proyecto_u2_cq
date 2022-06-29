package com.uce.edu.service;

import java.util.List;

import com.uce.edu.to.PersonaTo;

public interface IPersonaJdbcService {
	void insertarPersona(PersonaTo persona);

	void actualizarPersona(PersonaTo persona);

	PersonaTo buscarPorCedula(String cedula);

	void eliminarPorCedula(String cedula);
	
	List<PersonaTo> busarTodos();
}
