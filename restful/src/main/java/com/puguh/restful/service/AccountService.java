package com.puguh.restful.service;

import com.puguh.restful.dao.AccountDao;
import com.puguh.restful.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountDao accountDao;

    public List<Account> getAllAccount(){
        return accountDao.findAll();
    }
}
