package com.uce.edu.prueba.service;

import java.time.LocalDateTime;

import com.uce.edu.prueba.modelo.Matricula;


public interface IMatriculaService {

	void insertarMatricula(Matricula matricula);
	Matricula buscarPorId(Integer id);
	void actualizarMatricula(Matricula matricula);
	void eliminarPorId(Integer id);
}
