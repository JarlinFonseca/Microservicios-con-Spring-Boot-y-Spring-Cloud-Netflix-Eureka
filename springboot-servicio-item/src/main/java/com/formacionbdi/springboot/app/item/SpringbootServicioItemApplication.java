package com.formacionbdi.springboot.app.item;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;


@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class SpringbootServicioItemApplication {

	public static void main(String[] args) {
		   SpringApplication app = new SpringApplication(SpringbootServicioItemApplication.class);
			 app.setDefaultProperties(Collections .singletonMap("server.port", "8002"));
			 app.run(args);
			
	}

}
