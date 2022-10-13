package com.way.ssm.mapper;

import com.way.ssm.pojo.Account;

import java.util.List;

public interface AccountMapper {
    public List<Account> findAll();
    public  void save(Account account);
}
