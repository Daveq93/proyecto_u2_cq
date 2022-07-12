package com.uce.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.uce.edu.repository.modelo.Persona;

@Repository
@Transactional
public class PersonaJpaRepoImpl implements IPersonaJpaRepository {
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
		LOG.debug("Actualizar persona: " + persona.toString());
		this.em.merge(persona);
	}

	@Override
	public Persona buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		LOG.debug("Buscando por cedula");
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
		TypedQuery<Persona> myQ = this.em.createQuery("SELECT p FROM Persona p", Persona.class);
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
		Query jpqlQuery = this.em.createQuery("SELECT p FROM Persona p where p.genero=:genero");
		jpqlQuery.setParameter("genero", genero);
		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.em.createQuery("SELECT p FROM Persona p where p.nombre=:nombre");
		jpqlQuery.setParameter("nombre", nombre);
		return jpqlQuery.getResultList();
	}

	@Override
	public Integer actualizarPorApellido(String genero, String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.em.createQuery("UPDATE Persona p SET p.genero=:datoGenero WHERE p.apellido=:datoApellido");
        myQuery.setParameter("datoGenero", genero);
        myQuery.setParameter("datoApellido", apellido);
		
        return myQuery.executeUpdate();
	}

	@Override
	public Integer eliminarPorGenero(String genero) {
		// TODO Auto-generated method stub
		Query myQuery = this.em.createQuery("DELETE FROM Persona p WHERE p.genero=:datoGenero");
		myQuery.setParameter("datoGenero", genero);
		return myQuery.executeUpdate();
	}

	@Override
	public Persona buscarCedulaTyped(String cedula) {
		LOG.info("Buscando por cedula TYPED QUERY");
		TypedQuery<Persona> miQuery = this.em.createQuery("Select p FROM Persona p where p.cedula=:cedula",Persona.class);
		miQuery.setParameter("cedula", cedula);
		return miQuery.getSingleResult();
	}


	@Override
	public Persona buscarCedulaNamed(String cedula) {
		LOG.info("Buscando con NAMED QUERY");
		Query myQuery =this.em.createNamedQuery("Persona.buscarPorCedula");
		myQuery.setParameter("cedula", cedula);
		return (Persona) myQuery.getSingleResult();
	}

	@Override
	public Persona buscarCedulaTypedNamed(String cedula) {
		
		LOG.info("Busando por cedula -> TYPED - NAMED QUERY");
		TypedQuery<Persona> myQuery =this.em.createNamedQuery("Persona.buscarPorCedula",Persona.class);
		myQuery.setParameter("cedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Persona> buscarPorNombreApellidoNamed(String nombre, String apellido) {
		LOG.info("Busando por nombre y apellido -> NAMED QUERY");
		TypedQuery<Persona> myQuery =this.em.createNamedQuery("Persona.buscarPorNombreApellido",Persona.class);
		myQuery.setParameter("nombre", nombre);
		myQuery.setParameter("apellido", apellido);
		return myQuery.getResultList();
	}

}
