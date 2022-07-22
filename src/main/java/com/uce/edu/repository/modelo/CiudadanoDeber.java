package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ciudadano_d")

public class CiudadanoDeber {

	@Id
	@Column(name = "ciud_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_id_sequ")
	@SequenceGenerator(name = "ciud_id_sequ", sequenceName = "ciud_id_sequ", allocationSize = 1)
	private Integer id;
	@Column(name = "ciud_nombre")
	private String nombre;
	@Column(name = "ciud_apellido")
	private String apellido;
	@Column(name = "ciud_cedula")
	private String cedula;
	@Column(name = "ciud_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@OneToOne(mappedBy = "ciudadano",cascade = CascadeType.ALL)
	private Pasaporte pasaporte;
	
}
