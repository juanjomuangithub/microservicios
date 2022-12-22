package com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class NttdataSpringMicroservicesMsstudents1JjmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdataSpringMicroservicesMsstudents1JjmaApplication.class, args);
	}

}
