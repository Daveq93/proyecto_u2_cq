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
		return this.personaRepo.buscarCedula(cedula);
	}

	@Override
	public void eliminarPorCedula(String cedula) {
		this.personaRepo.eliminar(cedula);
	}

	@Override
	public List<Persona> busarTodos() {
		return this.personaRepo.busarTodos();
	}

	@Override
	public Persona buscarId(Integer id) {
		return this.personaRepo.buscarId(id);
	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		return this.personaRepo.buscarPorApellido(apellido);
	}

	@Override
	public List<Persona> buscarPorGenero(String genero) {
		return this.personaRepo.buscarPorGenero(genero);
	}

	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		return this.personaRepo.buscarPorNombre(nombre) ;
	}

	@Override
	public Integer actualizarPorApellido(String genero, String apellido) {
		// TODO Auto-generated method stub
		return this.personaRepo.actualizarPorApellido(genero, apellido);
	}

	@Override
	public Integer eliminarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.personaRepo.eliminarPorGenero(genero);
	}

}
