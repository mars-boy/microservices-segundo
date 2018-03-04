package com.marsboy.microservice.segundo.accountservice.implementation;

import com.marsboy.microservice.segundo.accountservice.DAO.AccountsDao;
import com.marsboy.microservice.segundo.accountservice.model.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AccountsDaoImpl extends AbstractDesignDaoImpl<Accounts,Long> implements AccountsDao {

    @Autowired
    private JdbcTemplate jtm;

    public AccountsDaoImpl(){
        super(Accounts.class);
    }

    @Override
    public List<Accounts> findAll() {
        String sql = "SELECT * FROM Accounts";
        return jtm.query(sql, new BeanPropertyRowMapper<>(Accounts.class));
    }
}
