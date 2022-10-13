package com.way.ssm.controller;

import com.way.ssm.pojo.Account;
import com.way.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/query")
    public ModelAndView findAll(ModelAndView modelAndView) {
        List<Account> accountList = accountService.findAll();
        modelAndView.addObject("accountList", accountList);//共享数据
        modelAndView.setViewName("list");//增加视图名称
        return modelAndView;
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(Account account) {
        accountService.save(account);
        return "success";
    }


}
