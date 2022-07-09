package com.uce.edu.prueba.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.prueba.modelo.Matricula;
import com.uce.edu.prueba.repository.IMatriculaRepo;



@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepo matriculaRepo;
	
	@Override
	public void insertarMatricula(Matricula matricula) {
		this.matriculaRepo.insertar(matricula);
	}

	

	@Override
	public void actualizarMatricula(Matricula matricula) {
		this.matriculaRepo.actualizar(matricula);
	}



	@Override
	public Matricula buscarPorId(Integer id) {
		return this.matriculaRepo.buscar(id);
	}



	@Override
	public void eliminarPorId(Integer id) {
		this.matriculaRepo.eliminar(id);
	}



	

	
	
}
