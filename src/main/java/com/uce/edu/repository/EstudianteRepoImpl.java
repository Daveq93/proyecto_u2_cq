package com.uce.edu.repository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.ProyectoU2Cq1Application;
import com.uce.edu.to.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {

	private static Logger LOG = Logger.getLogger(EstudianteRepoImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		LOG.info("Insertando estudiante: "+estudiante.toString());
		
		this.jdbcTemplate.update("INSERT INTO estudiante (id,nombre,apellido, cedula,edad) VALUES (?,?,?,?,?)",
				new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),
						estudiante.getCedula(), estudiante.getEdad() });
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		LOG.debug("Actualizando estudiante: "+estudiante.toString());
		this.jdbcTemplate.update("UPDATE estudiante SET nombre=?,apellido=?,cedula=?,edad=? WHERE id = ?",
				new Object[] { estudiante.getNombre(), estudiante.getApellido(), estudiante.getCedula(),
						estudiante.getEdad(), estudiante.getId() });
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		LOG.debug("Buscando por cedula: "+cedula);
		return this.jdbcTemplate.queryForObject("SELECT * FROM estudiante WHERE cedula=?", new Object[] { cedula },
				new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		LOG.info("Eliminando por id: "+id);
		this.jdbcTemplate.update("DELETE FROM estudiante WHERE id=?", new Object[] { id });
	}

}
