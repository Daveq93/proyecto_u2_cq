package com.uce.edu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.CiudadanoDeber;

@Repository
@Transactional
public class CiudadanoDeberRepoImpl implements ICiudadanoDeberRepo {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void insertar(CiudadanoDeber ciudadano) {
		// TODO Auto-generated method stub
		this.em.persist(ciudadano);
	}

	@Override
	public void actualizar(CiudadanoDeber ciudadano) {
		// TODO Auto-generated method stub
		 this.em.merge(ciudadano);
	}

	@Override
	public CiudadanoDeber buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<CiudadanoDeber> myQ = this.em.createQuery("SELECT c FROM CiudadanoDeber c WHERE c.cedula=:cedula",CiudadanoDeber.class);
		myQ.setParameter("cedula", cedula);
		
		return myQ.getSingleResult();
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		CiudadanoDeber c1 = this.buscarPorCedula(cedula);
		
		 this.em.remove(c1);;
	}

}
