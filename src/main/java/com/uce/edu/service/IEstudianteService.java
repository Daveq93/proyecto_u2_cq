package com.uce.edu.service;

import com.uce.edu.to.Estudiante;

public interface IEstudianteService {
	void insertarEstudiante(Estudiante estudiante);

	void actualizarEstudiante(Estudiante estudiante);

	Estudiante buscarPorCedula(String cedula);

	void eliminarPorId(Integer id);
}
