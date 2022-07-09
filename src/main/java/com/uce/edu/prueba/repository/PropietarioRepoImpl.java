package com.uce.edu.prueba.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.prueba.modelo.Propietario;



@Repository
@Transactional
public class PropietarioRepoImpl implements IPropietarioRepo {

	private static Logger LOG = Logger.getLogger(PropietarioRepoImpl.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.em.persist(propietario);
		
	}

	@Override
	public Propietario buscar(String cedula) {
		
		Query myQuery = this.em.createQuery("SELECT p FROM Propietario p WHERE p.cedula=:cedula");
		myQuery.setParameter("cedula", cedula);
		
		return (Propietario) myQuery.getSingleResult() ;
	}

	@Override
	public void actualizar(Propietario propietario) {
		LOG.info("Actualizando Propietario ");
		this.em.merge(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		LOG.info("Eliminando por cedula: "+cedula);
		Propietario p = this.buscar(cedula);
		this.em.remove(p);
	}

}
