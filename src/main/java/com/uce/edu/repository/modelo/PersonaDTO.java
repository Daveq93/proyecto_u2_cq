package com.uce.edu.repository.modelo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class PersonaDTO implements Serializable {
/* Serializable es para la web, este momento no es necesario*/
	private String nombre;
	private String apellido;
	private String cedula;
	
}
