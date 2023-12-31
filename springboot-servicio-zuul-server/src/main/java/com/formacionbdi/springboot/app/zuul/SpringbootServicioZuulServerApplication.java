package com.formacionbdi.springboot.app.zuul;

//import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//import com.formacionbdi.springboot.app.usuarios.SpringbootServicioUsuariosApplication;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class SpringbootServicioZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioZuulServerApplication.class, args);
		/*
		 * SpringApplication app = new
		 * SpringApplication(SpringbootServicioZuulServerApplication.class);
		 * app.setDefaultProperties(Collections .singletonMap("server.port", "8090"));
		 * app.run(args);
		 */
	}

}
