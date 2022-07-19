package com.uce.edu.repository.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class EstudianteDTO {

	private String nombre;
	
	private String cedula;
	
	private String genero;
	
}
