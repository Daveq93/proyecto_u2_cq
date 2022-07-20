package com.uce.edu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Ciudadano;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.em.persist(ciudadano);
	}


	
}
