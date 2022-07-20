package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICiudadanoRepo;
import com.uce.edu.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {

	@Autowired
	private ICiudadanoRepo ciudadanoRepo;
	
	@Override
	public void insertarCiudadano(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.insertar(ciudadano);
	}

}
