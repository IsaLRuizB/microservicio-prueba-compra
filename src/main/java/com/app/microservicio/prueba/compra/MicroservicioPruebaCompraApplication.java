package com.app.microservicio.prueba.compra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.app.commons.prueba.compra.models.entity","com.app.commons.alquiler.models.entity"})
@EnableTransactionManagement
@EnableJpaRepositories("com.app.microservicio.prueba.compra.models.repository")
public class MicroservicioPruebaCompraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioPruebaCompraApplication.class, args);
	}

}
