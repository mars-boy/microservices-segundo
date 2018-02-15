package com.marsboy.microservices.segundo.expensesservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // We need this to prevent the browser from popping up a dialog on a 401
        /*http.httpBasic().disable();*/
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/**")
                .hasAnyRole("ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
                /*http
				.httpBasic()
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();*/

    }
}
