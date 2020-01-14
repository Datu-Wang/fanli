package com.datu.fanli.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: datu
 * @date: 2020/1/11
 */
@SpringBootApplication
@MapperScan(value = "com.datu.fanli.manage.dao")
public class FanliManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanliManageServiceApplication.class, args);
    }

}
