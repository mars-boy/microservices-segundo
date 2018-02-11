package com.marsboy.microservices.segundo.expensesservice;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.marsboy.microservices.segundo.expensesservice")
public class ExpensesConfiguration {

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
