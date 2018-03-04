package com.marsboy.microservice.segundo.accountservice.restcontrollers;

import com.marsboy.microservice.segundo.accountservice.model.Accounts;
import com.marsboy.microservice.segundo.accountservice.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
public class AccountRestController {

    private List<String> list;

    private AccountsRepository accountsRepository;

    @Autowired
    public AccountRestController(AccountsRepository accountsRepository){
        this.accountsRepository = accountsRepository;
    }

    @Autowired
    private AccountsService accountsService;

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



    @GetMapping("/initializeData")
    public String initializeData(){
        Stream.of("TChalla","Peter Parker","Tony Stark","Captain Steve","Pepper")
                        .forEach(name -> accountsRepository.save(new Accounts(name)));
        return "data initialised";
    }

    @GetMapping("/accounts")
    public List<Accounts> getAllAccounts(){
        return accountsRepository.findAll();
    }

}

@RepositoryRestResource
interface AccountsRepository extends JpaRepository<Accounts, Long> {
}

@MessageEndpoint
class AccountProcessor{

    @Autowired
    private AccountsRepository accountsRepository;

    @ServiceActivator(inputChannel = Sink.INPUT)
    public void acceptNewAccount(String name){
        this.accountsRepository.save(new Accounts(name));
    }
}