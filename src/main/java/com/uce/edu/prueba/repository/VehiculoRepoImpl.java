package com.uce.edu.prueba.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.prueba.modelo.Vehiculo;



@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo{
	
	private static Logger LOG = Logger.getLogger(VehiculoRepoImpl.class);
	
	@PersistenceContext
	private EntityManager em;
			
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		LOG.debug("Insertanddo vehiculo: "+vehiculo.toString());
		this.em.persist(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		Query myQuery = this.em.createQuery("SELECT v FROM Vehiculo v WHERE v.placa=:placa");
		myQuery.setParameter("placa", placa);
		return (Vehiculo) myQuery.getSingleResult();
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		LOG.debug("Actualizando vehiculo ");
		this.em.merge(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		LOG.debug("Eliminando vehiculo por placa: "+placa);
		Vehiculo v = this.buscar(placa);
		this.em.remove(v);
	}

	
}
