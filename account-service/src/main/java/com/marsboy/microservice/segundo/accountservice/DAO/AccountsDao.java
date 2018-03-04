package com.marsboy.microservice.segundo.accountservice.DAO;

import com.marsboy.microservice.segundo.accountservice.model.Accounts;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsDao extends AbstractDesignDao<Accounts,Long> {
}
