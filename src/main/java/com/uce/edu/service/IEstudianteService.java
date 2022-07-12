package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Estudiante;


public interface IEstudianteService {
	void insertar(Estudiante estudiante);

	void actualizar(Estudiante estudiante);

	Estudiante buscarPorCedulaTyped(String cedula);

	List<Estudiante> buscarMenoresTyped(Integer edad);

	List<Estudiante> buscarporSemestreNamed(String semestre);
	
	List<Estudiante> buscarPorNombreApellidoNamed(String nombre, String apellido);
	
	List<Estudiante> buscarPorSemestreTypedNamed(String semestre);
	
	List<Estudiante> buscarPorApellidoMenoresATypedNamed(String apellido,Integer edad);

	void eliminar(String cedula);
}
