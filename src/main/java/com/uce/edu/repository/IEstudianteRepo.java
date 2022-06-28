package com.uce.edu.repository;

import com.uce.edu.to.Estudiante;

public interface IEstudianteRepo {

	void insertar(Estudiante estudiante);

	void actualizar(Estudiante estudiante);

	Estudiante buscar(String cedula);

	void eliminar(Integer id);
}
