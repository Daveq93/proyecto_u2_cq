package com.uce.edu.service;

import com.uce.edu.repository.modelo.CiudadanoDeber;

public interface ICiudadanoDeberService {
	void insertarCiudadano(CiudadanoDeber ciudadano);
	void actualizarCiudadano(CiudadanoDeber ciudadano);
	CiudadanoDeber buscarPorCedula(String cedula);
	void eliminarCiudadanoPorCedula(String cedula);
}
