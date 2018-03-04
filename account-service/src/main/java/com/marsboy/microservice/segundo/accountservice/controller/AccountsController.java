package com.marsboy.microservice.segundo.accountservice.controller;

import com.marsboy.microservice.segundo.accountservice.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AccountsController {

    @Autowired
    private AccountsService accountsService;


}
