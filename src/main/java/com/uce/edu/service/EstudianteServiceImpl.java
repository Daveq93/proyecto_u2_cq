package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IEstudianteRepo;
import com.uce.edu.to.EstudianteTo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public void insertarEstudiante(EstudianteTo estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public void actualizarEstudiante(EstudianteTo estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.actualizar(estudiante);
	}

	@Override
	public EstudianteTo buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscar(cedula);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepo.eliminar(id);
	}

}
