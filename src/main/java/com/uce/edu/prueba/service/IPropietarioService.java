package com.uce.edu.prueba.service;

import com.uce.edu.prueba.modelo.Propietario;

public interface IPropietarioService {
	void insertarPropietario(Propietario propietario);
	Propietario buscarPorCedula(String cedula);
	void actualizarPropietario(Propietario propietario);
	void eliminarPropietario(String cedula);
}
