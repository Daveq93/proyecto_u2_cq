package com.uce.edu.repository.modelo;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="empleado")
public class Empleado {

	@Id
	@Column(name = "empl_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empl_id_seq")
	@SequenceGenerator(name = "empl_id_seq", sequenceName = "empl_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name="empl_codigo_iess")
	private String codigoIESS;
	@Column(name="empl_salario")
	private BigDecimal salario;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empl_id_ciud")
	private Ciudadano ciudadano;
	
}
