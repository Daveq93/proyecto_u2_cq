package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

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
@Table(name="pasaporte")
public class Pasaporte {
	
	@Id
	@Column(name = "pasa_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pasa_id_seq")
	@SequenceGenerator(name = "pasa_id_seq", sequenceName = "pasa_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name="pasa_numero")
	private String numero;
	@Column(name="pasa_fecha_emision")
	private LocalDateTime fechaEmision;
	@Column(name="pasa_fecha_caducidad")
	private LocalDateTime fechaCaducidad;
	
	@OneToOne
	@JoinColumn(name="pasa_id_ciud")
	private CiudadanoDeber ciudadano;

	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", numero=" + numero + ", fechaEmision=" + fechaEmision + ", fechaCaducidad="
				+ fechaCaducidad + "]";
	}
	
	
	

}
