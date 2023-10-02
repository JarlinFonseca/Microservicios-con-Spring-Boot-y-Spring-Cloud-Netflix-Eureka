package com.formacionbdi.springboot.app.item;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootServicioItemApplication {

	public static void main(String[] args) {
		   SpringApplication app = new SpringApplication(SpringbootServicioItemApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8002"));
	        app.run(args);
	}

}
