package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Estudiante;

public interface IEstudianteRepo {

	void insertar(Estudiante estudiante);

	void actualizar(Estudiante estudiante);

	Estudiante buscarPorCedulaTyped(String cedula);

	List<Estudiante> buscarMenoresTyped(Integer edad);

	List<Estudiante> buscarporSemestreNamed(String semestre);
	
	List<Estudiante> buscarPorNombreApellidoNamed(String nombre, String apellido);
	
	List<Estudiante> buscarPorSemestreTypedNamed(String semestre);
	
	List<Estudiante> buscarPorApellidoMenoresATypedNamed(String apellido,Integer edad);
	
	List<Estudiante> buscarPorNombreGeneroNative(String nombre, String genero);
	
	List<Estudiante> buscarPorGeneroSemestreNative(String genero, String semestre);
	
	Estudiante buscarPorCedulaSemestreNamedNative(String cedula,String semestre);
	
	List<Estudiante> buscarPorGeneroEdadNamedNative(String genero, Integer edad);

	void eliminar(String cedula);
}
