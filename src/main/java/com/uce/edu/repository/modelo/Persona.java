package com.uce.edu.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="persona") //es opcional porner el nombre de la tabla, hibernet toma el nombre de la clase
                       //pero es buena practica especificarlo explicitamante
public class Persona {

	@Id
	@Column(name = "pers_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_id_seq")//name_generator son los identificadores de la secuencia, pero como buena practica se utiliza el mismo nombre de la secuencia de la base de datos, es decir "pers_id_seq"
	@SequenceGenerator(name = "pers_id_seq", sequenceName = "pers_id_seq", allocationSize = 1)//sequenceName -> obligatorio debe tener el mismo nomnbre que se espesifico en la base de datos
	private Integer id;
	
	@Column(name ="pers_nombre")
	private String nombre;
	
	@Column(name="pers_apellido")
	private String apellido;

	@Column(name="pers_cedula")
	private String cedula;
	
	@Column(name="pers_genero")
	private String genero;
	
	


	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", genero=" + genero + "]";
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
