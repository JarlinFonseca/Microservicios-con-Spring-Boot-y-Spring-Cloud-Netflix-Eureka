package com.formacionbdi.springboot.app.eureka;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootServicioEurekaServerApplication {

	public static void main(String[] args) {
		   SpringApplication app = new SpringApplication(SpringbootServicioEurekaServerApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8761"));
	        app.run(args);
	}
}
