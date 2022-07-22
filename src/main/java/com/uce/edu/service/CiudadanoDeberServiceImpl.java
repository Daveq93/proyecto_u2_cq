package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICiudadanoDeberRepo;
import com.uce.edu.repository.modelo.CiudadanoDeber;

@Service
public class CiudadanoDeberServiceImpl implements ICiudadanoDeberService{

	@Autowired
	private ICiudadanoDeberRepo ciudadanoRepo;
	
	@Override
	public void insertarCiudadano(CiudadanoDeber ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.insertar(ciudadano);
	}

	@Override
	public void actualizarCiudadano(CiudadanoDeber ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.actualizar(ciudadano);
	}

	@Override
	public CiudadanoDeber buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.buscarPorCedula(cedula);
	}

	@Override
	public void eliminarCiudadanoPorCedula(String cedula) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.eliminar(cedula);
	}

}
