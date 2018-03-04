package com.marsboy.microservice.segundo.accountservice.service;

import com.marsboy.microservice.segundo.accountservice.DAO.AccountsDao;
import com.marsboy.microservice.segundo.accountservice.model.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountsService {

    @Autowired
    private AccountsDao accountsDao;

    public void initialiseData(List<Accounts> accountsList){
        accountsDao.saveAll(accountsList);
    }

    public void saveAccount(Accounts accounts){
        accountsDao.save(accounts);
    }

    public List<Accounts> getAllAccounts(){
        return accountsDao.findAll();
    }
}
