package com.marsboy.microservices.segundo.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
@EnableZuulProxy
@EnableRedisHttpSession
@Controller
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}


	@GetMapping("/login")
    public String getLoginPage(){
	    return "login";
    }

    @GetMapping("/common/home")
    public String getExpensesHome(){
	    return "common/home";
    }
}
