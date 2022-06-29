package com.uce.edu.service;

import com.uce.edu.repository.modelo.Estudiante;

public interface IEstudianteJpaService {
	void insertarEstudiante(Estudiante estudiante);

	void actualizarEstudiante(Estudiante estudiante);

	Estudiante buscarPorCedula(String cedula);

	void eliminarPorCedula(String cedula);
}
