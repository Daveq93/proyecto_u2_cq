package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Persona;

public interface IPersonaJpaRepository {
	void insertar(Persona persona);

	void actualizar(Persona persona);

	Persona buscar(String cedula);

	void eliminar(String cedula);

	List<Persona> busarTodos();
}
