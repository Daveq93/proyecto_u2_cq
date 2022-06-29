package com.uce.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.ProyectoU2Cq1Application;
import com.uce.edu.repository.modelo.Persona;

@Repository
@Transactional
public class PersonaJpaRepoImpl implements IPersonaJpaRepository{
	private static Logger LOG = Logger.getLogger(PersonaJpaRepoImpl.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.em.persist(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		LOG.debug("Actualizar persona: "+persona.toString());
		this.em.merge(persona);
	}

	@Override
	public Persona buscar(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myQ = this.em.createQuery("SELECT p FROM Persona p where p.cedula=:valor",Persona.class);
		myQ.setParameter("valor", cedula);
		return myQ.getSingleResult();
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Persona p = this.buscar(cedula);
		this.em.remove(p);
	}

	@Override
	public List<Persona> busarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myQ = this.em.createQuery("SELECT p FROM Persona p",Persona.class);
		return myQ.getResultList();
	}

}
