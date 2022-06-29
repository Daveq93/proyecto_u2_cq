package com.uce.edu.repository;

import com.uce.edu.to.EstudianteTo;

public interface IEstudianteRepo {

	void insertar(EstudianteTo estudiante);

	void actualizar(EstudianteTo estudiante);

	EstudianteTo buscar(String cedula);

	void eliminar(Integer id);
}
