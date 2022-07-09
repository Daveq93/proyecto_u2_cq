package com.uce.edu.prueba.service;

import com.uce.edu.prueba.modelo.Vehiculo;

public interface IVehiculoService {
	void insertarVehiculo(Vehiculo vehiculo);

	Vehiculo buscarPorPlaca(String placa);

	void actualizarVehiculo(Vehiculo vehiculo);

	void eliminarPorPlaca(String placa);
}
