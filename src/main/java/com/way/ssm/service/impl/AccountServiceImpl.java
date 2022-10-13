package com.way.ssm.service.impl;

import com.way.ssm.mapper.AccountMapper;
import com.way.ssm.pojo.Account;
import com.way.ssm.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    public List<Account> findAll() {
            List<Account> list = accountMapper.findAll();
            return list;
    }

    @Override
    public void save(Account account) {
            accountMapper.save(account);
    }
}
