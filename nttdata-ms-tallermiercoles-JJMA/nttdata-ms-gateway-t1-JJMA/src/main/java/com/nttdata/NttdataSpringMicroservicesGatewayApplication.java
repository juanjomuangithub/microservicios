package com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author Juanjo
 * 
 * clase principal
 *
 */

@SpringBootApplication
public class NttdataSpringMicroservicesGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdataSpringMicroservicesGatewayApplication.class, args);
	}

}
