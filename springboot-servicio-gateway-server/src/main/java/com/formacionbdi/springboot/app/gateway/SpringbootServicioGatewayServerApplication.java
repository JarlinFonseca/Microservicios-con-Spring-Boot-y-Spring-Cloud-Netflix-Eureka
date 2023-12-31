package com.formacionbdi.springboot.app.gateway;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioGatewayServerApplication {

	public static void main(String[] args) {
		 SpringApplication app = new SpringApplication(SpringbootServicioGatewayServerApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8090"));
	        app.run(args);
	}

}
