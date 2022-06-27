package com.uce.edu;


import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProyectoU2Cq1Application implements CommandLineRunner{

	private static Logger LOG = Logger.getLogger(ProyectoU2Cq1Application.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2Cq1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola .... ");
		
		
		LOG.debug("probando LOG DEBUG");
		LOG.info("probando LOG INFO");
		LOG.error("probando LOG Error");
		LOG.warn("probando LOG WARN");
		LOG.fatal("probando LOG FATAL");
	}

}
