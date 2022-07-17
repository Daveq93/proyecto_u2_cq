package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IEstudianteRepo;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.to.EstudianteTo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
	
	@Autowired
	private IEstudianteRepo estuRepo;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estuRepo.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estuRepo.actualizar(estudiante);
	}

	@Override
	public Estudiante buscarPorCedulaTyped(String cedula) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarPorCedulaTyped(cedula);
	}

	@Override
	public List<Estudiante> buscarMenoresTyped(Integer edad) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarMenoresTyped(edad);
	}

	@Override
	public List<Estudiante> buscarporSemestreNamed(String semestre) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarporSemestreNamed(semestre);
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarPorNombreApellidoNamed(nombre, apellido);
	}

	@Override
	public List<Estudiante> buscarPorSemestreTypedNamed(String semestre) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarPorSemestreTypedNamed(semestre);
	}

	@Override
	public List<Estudiante> buscarPorApellidoMenoresATypedNamed(String apellido, Integer edad) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarPorApellidoMenoresATypedNamed(apellido, edad);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.estuRepo.eliminar(cedula);
	}

	@Override
	public List<Estudiante> buscarPorNombreGeneroNative(String nombre, String genero) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarPorNombreGeneroNative(nombre, genero);
	}

	@Override
	public List<Estudiante> buscarPorGeneroSemestreNative(String genero, String semestre) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarPorGeneroSemestreNative(genero, semestre);
	}

	@Override
	public Estudiante buscarPorCedulaSemestreNamedNative(String cedula, String semestre) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarPorCedulaSemestreNamedNative(cedula, semestre);
	}

	@Override
	public List<Estudiante> buscarPorGeneroEdadNamedNative(String genero, Integer edad) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarPorGeneroEdadNamedNative(genero, edad);
	}

	@Override
	public Estudiante buscarPorCedulaSemestreDinamicamente(String cedula, String semestre) {
		// TODO Auto-generated method stub
		return this.estuRepo.buscarPorCedulaSemestreDinamicamente(cedula, semestre);
	}

	@Override
	public List<Estudiante> busarPorNombreApellidoEdadDicamico(String nombre, String apellido, Integer edad) {
		// TODO Auto-generated method stub
		return this.estuRepo.busarPorNombreApellidoEdadDicamico(nombre, apellido, edad);
	}

	

}
