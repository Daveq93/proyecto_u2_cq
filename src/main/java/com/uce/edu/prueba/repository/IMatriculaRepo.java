package com.uce.edu.prueba.repository;

import java.time.LocalDateTime;

import com.uce.edu.prueba.modelo.Matricula;



public interface IMatriculaRepo {

	
	void insertar(Matricula matricula);
	Matricula buscar(Integer id);
	void actualizar(Matricula matricula);
	void eliminar(Integer id);
}
