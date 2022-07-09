package com.uce.edu.prueba.modelo;

import java.math.BigDecimal;

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
@Table(name="vehiculo")
public class Vehiculo {

	@Id
	@Column(name = "vehi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_id_seq")
	@SequenceGenerator(name = "vehi_id_seq", sequenceName = "vehi_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name="vehi_marca")
	private String marca;
	
	@Column(name="vehi_placa")
	private String placa;
	
	@Column(name="vehi_tipo")
	private String tipo;
	
	@Column(name="vehi_precio")
	private BigDecimal precio;


}
