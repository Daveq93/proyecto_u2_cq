package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IPersonaJdbcRepository;
import com.uce.edu.to.Persona;

@Service
public class PersonaJdbcServiceImpl implements IPersonaJdbcService {

//	@Autowired
//	private IPersonaJdbcRepository personaRepo;
//	
//	@Override
//	public void insertarPersona(Persona persona) {
//		// TODO Auto-generated method stub
//		this.personaRepo.insertar(persona);
//	}
//
//	@Override
//	public void actualizarPersona(Persona persona) {
//		// TODO Auto-generated method stub
//		this.personaRepo.actualizar(persona);
//	}
//
//	@Override
//	public Persona buscarPorNombre(String nombre) {
//		// TODO Auto-generated method stub
//		return this.personaRepo.buscar(nombre);
//	}
//
//	@Override
//	public void eliminarPorNombre(String nombre) {
//		// TODO Auto-generated method stub
//		this.personaRepo.eliminar(nombre);
//	}

}
