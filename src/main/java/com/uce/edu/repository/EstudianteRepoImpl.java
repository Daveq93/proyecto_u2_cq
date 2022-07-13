package com.uce.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Repository;


import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.to.EstudianteTo;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

	private static Logger LOG = Logger.getLogger(EstudianteRepoImpl.class);

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.em.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.em.merge(estudiante);
	}

	@Override
	public Estudiante buscarPorCedulaTyped(String cedula) {
		LOG.debug("Buscando por cedula TYPED QUERY");
		TypedQuery<Estudiante> myQuery = this.em.createQuery("SELECT e FROM Estudiante e WHERE e.cedula=:cedula",Estudiante.class);
		myQuery.setParameter("cedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarMenoresTyped(Integer edad) {
		// TODO Auto-generated method stub
		LOG.debug("Bucando menores a: "+edad +" TYPED QUERY");
		TypedQuery<Estudiante> myQuery = this.em.createQuery("SELECT e FROM Estudiante e WHERE e.edad<=:edad",Estudiante.class);
		myQuery.setParameter("edad", edad);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarporSemestreNamed(String semestre) {
		LOG.debug("buscando por semestre NAMED QUERY");
		Query myQuery = this.em.createNamedQuery("Estudiante.buscarPorSemestre");
		myQuery.setParameter("semestre", semestre);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamed(String nombre, String apellido) {
		LOG.debug("Buscando por Nombre y Apellido NAMED QUERY");
		Query myQuery = this.em.createNamedQuery("Estudiante.buscarPorNombreApellido");
		myQuery.setParameter("nombre", nombre);
		myQuery.setParameter("apellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorSemestreTypedNamed(String semestre) {
		LOG.debug("Buscando por semestre TYPED NAMED QUERY");
		TypedQuery<Estudiante> myQ = this.em.createNamedQuery("Estudiante.buscarPorSemestre", Estudiante.class);
		myQ.setParameter("semestre", semestre);
		return myQ.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorApellidoMenoresATypedNamed(String apellido,Integer edad) {
		LOG.debug("Buscando por apellido y menores a: "+edad+" TYPED NAMED QUERY");
		TypedQuery<Estudiante> myQ= this.em.createNamedQuery("Estudiante.buscarPorApellidoMenoresA", Estudiante.class);
		myQ.setParameter("apellido",apellido );
		myQ.setParameter("edad", edad);
		return myQ.getResultList();
	}

	@Override
	public void eliminar(String cedula) {
		Query myQ = this.em.createQuery("DELETE e FROM Estudiante e WHERE e.cedula=:cedula");
		myQ.setParameter("cedula", cedula);
		myQ.executeUpdate();
		
	}

	@Override
	public List<Estudiante> buscarPorNombreGeneroNative(String nombre, String genero) {
		LOG.debug("Buscando por nombre y genero NATIVE QUERY");
		Query myQ =  this.em.createNativeQuery("SELECT * FROM estudiante WHERE estu_nombre=:nombre AND estu_genero=:genero",Estudiante.class);
		myQ.setParameter("nombre",nombre );
		myQ.setParameter("genero", genero);
		return myQ.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorGeneroSemestreNative(String genero, String semestre) {
		LOG.debug("buscando por genero y semestre NATIVE QUERY");
		Query myQ =  this.em.createNativeQuery("SELECT * FROM estudiante WHERE estu_genero=:genero AND estu_semestre=:semestre",Estudiante.class);
		myQ.setParameter("genero",genero );
		myQ.setParameter("semestre",semestre );
		return myQ.getResultList();
	}

	@Override
	public Estudiante buscarPorCedulaSemestreNamedNative(String cedula, String semestre) {
		LOG.debug("Buscando por cedula y semestre NAMED NATIVE QUERY");
		TypedQuery<Estudiante> myQ = this.em.createNamedQuery("Estudiante.buscarPorCedulaSemestre", Estudiante.class);
		myQ.setParameter("cedula", cedula);
		myQ.setParameter("semestre", semestre);
		return myQ.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorGeneroEdadNamedNative(String genero, Integer edad) {
		// TODO Auto-generated method stub
		LOG.debug("Buscando por genero y edad  NAMED NATIVE QUERY");
		Query myQ = this.em.createNamedQuery("Estudiante.buscarPorGeneroEda",Estudiante.class);
		myQ.setParameter("genero", genero);
		myQ.setParameter("edad", edad);
		return myQ.getResultList();
	}
	
	

}
