package com.marsboy.microservice.segundo.accountservice.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountRestController {

    private List<String> list;

    public AccountRestController(){
        list = new ArrayList<String>();
        for(int i = 0; i < 6;i++){
            list.add("list"+i);
        }
    }

    @GetMapping("/lists")
    public List<String> getAllList(){
        return list;
    }
}
