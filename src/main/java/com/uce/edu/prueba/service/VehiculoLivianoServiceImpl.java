package com.uce.edu.prueba.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("liviano")
public class VehiculoLivianoServiceImpl implements IMatriculaVehicularService {

	@Override
	public BigDecimal calcularDescuento(BigDecimal precio) {
		// TODO Auto-generated method stub
		return precio.multiply(new BigDecimal(0.10));
	}

}
