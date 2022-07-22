package com.uce.edu.repository;

import com.uce.edu.repository.modelo.CiudadanoDeber;

public interface ICiudadanoDeberRepo {

	
	void insertar(CiudadanoDeber ciudadano);
	void actualizar(CiudadanoDeber ciudadano);
	CiudadanoDeber buscarPorCedula(String cedula);
	void eliminar(String cedula);
}
