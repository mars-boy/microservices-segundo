package com.masboy.microservices.segundo.d_learn_side_car.deepLearnSideCar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/admin/**")
                .hasAnyRole("ADMIN")
                .anyRequest()
                .authenticated()
                .antMatchers("/common/**")
                .hasAnyRole("USER","ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();

    }
}
