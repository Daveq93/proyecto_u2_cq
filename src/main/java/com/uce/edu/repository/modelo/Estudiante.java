package com.uce.edu.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "estudiante")
@NamedQuery(name="Estudiante.buscarPorSemestre",query = "SELECT e FROM Estudiante e WHERE e.semestre =:semestre")
@NamedQuery(name="Estudiante.buscarPorNombreApellido",query = "SELECT e FROM Estudiante e WHERE e.nombre=:nombre AND e.apellido =:apellido")
@NamedQuery(name="Estudiante.buscarPorApellidoMenoresA",query="SELECT e FROM Estudiante e WHERE e.apellido=:apellido AND e.edad <=:edad") 

@NamedNativeQuery(name="Estudiante.buscarPorCedulaSemestre",query = "SELECT * FROM estudiante WHERE estu_cedula=:cedula AND estu_semestre=:semestre",resultClass = Estudiante.class)
@NamedNativeQuery(name="Estudiante.buscarPorGeneroEda",query = "SELECT * FROM estudiante WHERE estu_genero=:genero AND estu_edad<=:edad",resultClass = Estudiante.class)
public class Estudiante {
	
	@Id
	@Column(name = "estu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_id_seq")
	@SequenceGenerator(name = "estu_id_seq", sequenceName = "estu_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "estu_nombre")
	private String nombre;
	
	@Column(name = "estu_apellido")
	private String apellido;
	
	@Column(name = "estu_cedula")
	private String cedula;
	
	@Column(name = "estu_edad")
	private Integer edad;
	
	@Column(name="estu_semestre")
	private String semestre;
	
	@Column(name="estu_genero")
	private String genero;

}
