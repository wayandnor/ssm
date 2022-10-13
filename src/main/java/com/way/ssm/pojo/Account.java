package com.way.ssm.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {
    private Integer id;
    private String name;
    private BigDecimal balance;
}
