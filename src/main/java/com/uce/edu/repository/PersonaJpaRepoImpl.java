package com.uce.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
	public Persona buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		LOG.debug("Buscando por cedula");
//		TypedQuery<Persona> myQ = this.em.createQuery("SELECT p FROM Persona p where p.cedula=:valor",Persona.class);
//		myQ.setParameter("valor", cedula);
		
		Query jpqlQuery = this.em.createQuery("SELECT p FROM Persona p where p.cedula=:valorCedula");
		jpqlQuery.setParameter("valorCedula", cedula);
		
		return (Persona) jpqlQuery.getSingleResult();
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Persona p = this.buscarCedula(cedula);
		this.em.remove(p);
	}

	@Override
	public List<Persona> busarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myQ = this.em.createQuery("SELECT p FROM Persona p",Persona.class);
		return myQ.getResultList();
	}

	@Override
	public Persona buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.em.find(Persona.class, id);
	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		Query jpqlQuery = this.em.createQuery("SELECT p FROM Persona p where p.apellido=:apellido");
		jpqlQuery.setParameter("apellido", apellido);
		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		//Query jpqlQuery = this.em.createQuery("SELECT p FROM Persona p where p.genero=:genero");
		//jpqlQuery.setParameter("genero", genero);
		return null;
	}

}
