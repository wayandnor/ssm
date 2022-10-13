package com.way.ssm.service.impl;

import com.way.ssm.mapper.AccountMapper;
import com.way.ssm.pojo.Account;
import com.way.ssm.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    public List<Account> findAll() {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sessionFactory.openSession();
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> list = accountMapper.findAll();
            sqlSession.close();
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void save(Account account) {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sessionFactory.openSession();
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            accountMapper.save(account);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
