package com.uce.edu.service;

import com.uce.edu.to.Persona;

public interface IPersonaJdbcService {
	void insertarPersona(Persona persona);

	void actualizarPersona(Persona persona);

	Persona buscarPorCedula(String cedula);

	void eliminarPorCedula(String cedula);
}
