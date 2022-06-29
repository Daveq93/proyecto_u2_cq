package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Estudiante;

public interface IEstudianteJpaRepo {
	void insertar(Estudiante estudiante);

	void actualizar(Estudiante estudiante);

	Estudiante buscar(String cedula);

	void eliminar(String cedula);
}
