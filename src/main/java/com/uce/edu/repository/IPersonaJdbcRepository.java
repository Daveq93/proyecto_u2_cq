package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.to.PersonaTo;

public interface IPersonaJdbcRepository {

	void insertar (PersonaTo persona);
	void actualizar(PersonaTo persona);
	PersonaTo buscar(String cedula);
	void eliminar(String cedula);
	
	List<PersonaTo> busarTodos();
	
	
}
