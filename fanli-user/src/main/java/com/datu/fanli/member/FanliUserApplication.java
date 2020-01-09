package com.datu.fanli.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author: datu
 * @date: 2020/1/9
 */
@MapperScan(value = "com.datu.fanli.member.dao")
@SpringBootApplication
public class FanliUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanliUserApplication.class, args);
    }

}
