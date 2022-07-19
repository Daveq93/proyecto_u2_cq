package com.uce.edu.repository.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteContarEntreEdad {

	private String nombre;
	
	private String semestre;
	
	private String cedula;
	
	private int edad;
	
}
