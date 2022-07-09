package com.uce.edu.prueba.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.prueba.modelo.Matricula;


@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo{

	private static Logger LOG = Logger.getLogger(MatriculaRepoImpl.class);
	
	@PersistenceContext
	private EntityManager em;

	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		LOG.info("Insertando matricula: "+matricula.toString());
		this.em.persist(matricula);
	}

	@Override
	public Matricula buscar(Integer id) {
		LOG.info("buscando matricula por id "+id);
		
		return this.em.find(Matricula.class, id) ;
	}

	@Override
	public void actualizar(Matricula matricula) {
		LOG.info("Actualizando matricula");
		this.em.merge(matricula);
	}

	@Override
	public void eliminar(Integer id) {
		LOG.info("Eliminando por Id: "+id);
		Matricula m = this.buscar(id);
		this.em.remove(m);
	}

}
