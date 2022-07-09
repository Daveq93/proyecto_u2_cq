package com.uce.edu.prueba.repository;

import com.uce.edu.prueba.modelo.Propietario;

public interface IPropietarioRepo {

	
	void insertar(Propietario propietario);
	Propietario buscar(String cedula);
	void actualizar(Propietario propietario);
	void eliminar(String cedula);
	
	
	
}
