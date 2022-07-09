package com.uce.edu.prueba.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name="matricula")
public class Matricula {

	@Id
	@Column(name = "mtri_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mtri_id_seq")
	@SequenceGenerator(name = "mtri_id_seq", sequenceName = "mtri_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "mtri_fecha_matricula")
	private LocalDateTime fechaMatricula;
	
	@Column(name = "mtri_valor_matricula")
	private BigDecimal valorMatricula;

	//para que no genere el error estos dos atributos estan comentados
//	@Column(name = "mtri_propietario")
//	private Propietario propietario;
//	
//	@Column(name = "mtri_vehiculo")
//	private Vehiculo vehiculo;


	
	
}
