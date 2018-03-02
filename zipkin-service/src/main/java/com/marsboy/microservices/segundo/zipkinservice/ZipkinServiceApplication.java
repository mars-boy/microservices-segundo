package com.marsboy.microservices.segundo.zipkinservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.Bean;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
/*@EnableZipkinServer*/
@EnableZipkinStreamServer
public class ZipkinServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServiceApplication.class, args);
	}

	/*@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}*/

}