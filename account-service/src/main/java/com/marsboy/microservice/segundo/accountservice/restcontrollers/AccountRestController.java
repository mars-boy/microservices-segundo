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
        list.add("nigga");
        list.add("black panther");
        list.add("kendrik lamar");
        list.add("Obama");
        list.add("You fking racist");
        list.add("wtf");
    }

    @GetMapping("/lists")
    public List<String> getAllList(){
        return list;
    }
}
