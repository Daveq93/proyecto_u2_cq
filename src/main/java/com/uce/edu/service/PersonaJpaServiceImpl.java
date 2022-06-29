package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IPersonaJpaRepository;
import com.uce.edu.repository.modelo.Persona;

@Service
public class PersonaJpaServiceImpl implements IPersonaJpaService {

	@Autowired
	private IPersonaJpaRepository personaRepo;
	
	@Override
	public void insertarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.personaRepo.insertar(persona);
	}

	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.personaRepo.actualizar(persona);
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.personaRepo.buscar(cedula);
	}

	@Override
	public void eliminarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		this.personaRepo.eliminar(cedula);
	}

	@Override
	public List<Persona> busarTodos() {
		// TODO Auto-generated method stub
		return this.personaRepo.busarTodos();
	}

}
