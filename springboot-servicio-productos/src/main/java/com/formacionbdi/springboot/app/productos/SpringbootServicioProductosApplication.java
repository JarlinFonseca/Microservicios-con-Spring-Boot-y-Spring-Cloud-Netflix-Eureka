package com.formacionbdi.springboot.app.productos;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.formacionbdi.springboot.app.commons.models.entity"})
public class SpringbootServicioProductosApplication {

	public static void main(String[] args) {
		   SpringApplication app = new SpringApplication(SpringbootServicioProductosApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8001"));
	        app.run(args);
	}

}
