package com.uce.edu.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.prueba.modelo.Propietario;
import com.uce.edu.prueba.repository.IPropietarioRepo;



@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepo propietarioRepo;
	
	@Override
	public void insertarPropietario(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepo.insertar(propietario);
	}

	@Override
	public Propietario buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepo.buscar(cedula);
	}

	@Override
	public void actualizarPropietario(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepo.actualizar(propietario);
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepo.eliminar(cedula);
	}

}
