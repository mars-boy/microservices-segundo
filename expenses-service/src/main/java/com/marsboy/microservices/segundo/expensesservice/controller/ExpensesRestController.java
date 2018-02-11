package com.marsboy.microservices.segundo.expensesservice.controller;

import com.marsboy.microservices.segundo.expensesservice.intercommunication.AccountClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExpensesRestController {

    @Autowired
    private AccountClientService accountClientService;

    @GetMapping(value = "/explists")
    public List<String> getList(){
        List<String> list = new ArrayList<String>(accountClientService.getAllList());
        list.add("hakuna matata");
        return list;
    }
}
