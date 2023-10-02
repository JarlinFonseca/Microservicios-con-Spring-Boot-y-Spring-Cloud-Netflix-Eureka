package com.formacionbdi.springboot.app.productos;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootServicioProductosApplication {

	public static void main(String[] args) {
		   SpringApplication app = new SpringApplication(SpringbootServicioProductosApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8001"));
	        app.run(args);
	}

}
