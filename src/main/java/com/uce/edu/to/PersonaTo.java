package com.uce.edu.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@Entity
//@Table(name="persona")
public class PersonaTo {

	//@Id
	//@Column(name = "pers_id")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_persona")
	//@SequenceGenerator(name = "seq_persona", sequenceName = "seq_persona", allocationSize = 1)
	private Integer id;
	
	//@Column(name ="pers_nombre")
	private String nombre;
	
	//@Column(name="pers_apellido")
	private String apellido;

	private String cedula;
	
	
	public PersonaTo(Integer id, String nombre, String apellido, String cedula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	//Constructor por defecto
	public PersonaTo() {
		//super();
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}

	//set and get
	public Integer getId() {
		return id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	
}
