package com.formacionbdi.springboot.app.config;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class SpringbootServicioConfigServerApplication {

	public static void main(String[] args) {
		   SpringApplication app = new SpringApplication(SpringbootServicioConfigServerApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8888"));
	        app.run(args);
	}

}
