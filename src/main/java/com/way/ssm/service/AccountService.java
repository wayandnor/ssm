package com.way.ssm.service;

import com.way.ssm.pojo.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);
    List<Account> findAll();
}
