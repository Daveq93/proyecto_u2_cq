package com.uce.edu.prueba.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="propietario")
public class Propietario {
	@Id
	@Column(name = "prop_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prop_id_seq")
	@SequenceGenerator(name = "prop_id_seq", sequenceName = "prop_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "prop_nombre")
	private String nombre;
	@Column(name = "prop_apellido")
	private String apellido;
	@Column(name = "prop_cedula")
	private String cedula;
	@Column(name = "prop_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;

}
