package com.marsboy.microservices.segundo.expensesservice.intercommunication;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("account-service")
public interface AccountClientService {

    @GetMapping(value = "/lists")
    List<String> getAllList();
}
