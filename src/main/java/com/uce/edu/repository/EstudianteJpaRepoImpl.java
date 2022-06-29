package com.uce.edu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.ProyectoU2Cq1Application;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.to.EstudianteTo;

@Repository
@Transactional
public class EstudianteJpaRepoImpl implements IEstudianteJpaRepo{

	private static Logger LOG = Logger.getLogger(EstudianteJpaRepoImpl.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		LOG.debug("Insertando estudiante: "+estudiante.toString());
		this.em.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		LOG.debug("Actualizando estudiante: "+estudiante.toString());
		this.em.merge(estudiante);
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		LOG.debug("Buscando por cedula: "+cedula);
		TypedQuery<Estudiante> myQ = this.em.createQuery("SELECT e FROM Estudiante e WHERE e.cedula=:valor", Estudiante.class);
		myQ.setParameter("valor", cedula);
		return myQ.getSingleResult();
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		LOG.debug("Eliminando por cedula: "+cedula);
		Estudiante e = this.buscar(cedula);
		this.em.remove(e);
	}

}
