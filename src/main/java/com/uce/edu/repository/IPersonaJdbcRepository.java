package com.uce.edu.repository;

import com.uce.edu.to.Persona;

public interface IPersonaJdbcRepository {

	void insertar (Persona persona);
	void actualizar(Persona persona);
	Persona buscar(String cedula);
	void eliminar(String cedula);
	
	
}
