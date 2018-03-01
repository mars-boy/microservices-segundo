package com.marsboy.microservices.segundo.expensesservice.controller;

import com.marsboy.microservices.segundo.expensesservice.intercommunication.AccountClientService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ExpensesRestController {

    @Autowired
    private AccountClientService accountClientService;

    @HystrixCommand(fallbackMethod = "getTempExpList")
    @GetMapping(value = "/common/explists")
    public List<String> getList(){
        List<String> list = new ArrayList<String>(accountClientService.getAllList());
        list.add("hakuna matata");
        return list;
    }

    public List<String> getTempExpList(){
        return Arrays.asList("No data available","just a dummy data");
    }

    @GetMapping(value="/common/userinfo")
    public String  getUserInfo(Principal user){
        return user.getName();
    }
}
