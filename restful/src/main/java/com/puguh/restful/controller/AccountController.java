package com.puguh.restful.controller;

import com.puguh.restful.dao.AccountDao;
import com.puguh.restful.entity.Account;
import com.puguh.restful.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Account> getAll(){
    return accountService.getAllAccount();
    }
}
