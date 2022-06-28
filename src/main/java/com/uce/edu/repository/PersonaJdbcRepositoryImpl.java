package com.uce.edu.repository;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.ProyectoU2Cq1Application;
import com.uce.edu.to.Persona;

@Repository
@Transactional
public class PersonaJdbcRepositoryImpl implements IPersonaJdbcRepository {

	private static Logger LOG = Logger.getLogger(PersonaJdbcRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		// this.jdbcTemplate.update("insert into persona (id,nombre,apellido,cedula)
		// values("+persona.getId()+",'"+persona.getNombre()+"','"+persona.getApellido()+"','"+persona.getCedula()+"')");//no
		// es recomendable

		LOG.debug("Insertando: " + persona.toString());
		this.jdbcTemplate.update("INSERT INTO persona (id,nombre,apellido,cedula) VALUES(?,?,?,?)",
				new Object[] { persona.getId(), persona.getNombre(), persona.getApellido(), persona.getCedula() });

	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		LOG.info("Actualizando: " + persona.toString());
		this.jdbcTemplate.update("UPDATE persona set  nombre=?,apellido=?,cedula=? where id=?",
				new Object[] { persona.getNombre(), persona.getApellido(), persona.getCedula(), persona.getId() });
	}

	@Override
	public Persona buscar(String cedula) {
		// TODO Auto-generated method stub
		LOG.debug("Buscando por cedula: " + cedula);

		return this.jdbcTemplate.queryForObject("SELECT * FROM persona WHERE cedula=?", new Object[] { cedula },
				new BeanPropertyRowMapper<Persona>(Persona.class));
	}

	@Override
	public void eliminar(String cedula) {
		LOG.debug("Eliminando por cedula: " + cedula);
		this.jdbcTemplate.update("DELETE FROM persona WHERE cedula=?", new Object[] { cedula });
	}
}
