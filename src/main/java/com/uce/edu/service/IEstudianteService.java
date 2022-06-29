package com.uce.edu.service;

import com.uce.edu.to.EstudianteTo;

public interface IEstudianteService {
	void insertarEstudiante(EstudianteTo estudiante);

	void actualizarEstudiante(EstudianteTo estudiante);

	EstudianteTo buscarPorCedula(String cedula);

	void eliminarPorId(Integer id);
}
