package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IPersonaJdbcRepository;
import com.uce.edu.to.PersonaTo;

@Service
public class PersonaJdbcServiceImpl implements IPersonaJdbcService {

	@Autowired
	private IPersonaJdbcRepository personaRepo;
	
	@Override
	public void insertarPersona(PersonaTo persona) {
		// TODO Auto-generated method stub
		this.personaRepo.insertar(persona);
	}

	@Override
	public void actualizarPersona(PersonaTo persona) {
		// TODO Auto-generated method stub
		this.personaRepo.actualizar(persona);
	}

	@Override
	public PersonaTo buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.personaRepo.buscar(cedula);
	}

	@Override
	public void eliminarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		this.personaRepo.eliminar(cedula);
	}

	@Override
	public List<PersonaTo> busarTodos() {
		// TODO Auto-generated method stub
		return this.personaRepo.busarTodos();
	}



}
