package com.masboy.microservices.segundo.d_learn_side_car.deepLearnSideCar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSidecar
public class DeepLearnSideCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeepLearnSideCarApplication.class, args);
	}
}
