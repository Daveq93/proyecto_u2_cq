package com.uce.edu.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="persona") //es opcional porner el nombre de la tabla, hibernet toma el nombre de la clase
                       //pero es buena practica especificarlo explicitamante
//@NamedQueries({/* el mas antiguo */
//	@NamedQuery(name="Persona.buscarPorCedula",query = "Select p FROM Persona p where p.cedula=:cedula"),
//	@NamedQuery(name="Persona.buscarPorNombreApellido",query = "SELECT p FROM Persona p WHERE p.nombre=:nombre AND p.apellido=:apellido")
//})

//Forma actual, la mas usada y el que usaremos
	@NamedQuery(name="Persona.buscarPorCedula",query = "Select p FROM Persona p where p.cedula=:cedula")
	@NamedQuery(name="Persona.buscarPorNombreApellido",query = "SELECT p FROM Persona p WHERE p.nombre=:nombre AND p.apellido=:apellido")
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
		
	
}
