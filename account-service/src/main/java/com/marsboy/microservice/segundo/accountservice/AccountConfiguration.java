package com.marsboy.microservice.segundo.accountservice;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.marsboy.microservice.segundo.accountservice")
public class AccountConfiguration {

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }
}
