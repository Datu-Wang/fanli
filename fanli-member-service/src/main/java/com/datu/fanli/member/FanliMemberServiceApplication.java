package com.datu.fanli.member;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: datu
 * @date: 2020/1/10
 */
@MapperScan(value = "com.datu.fanli.member.dao")
@SpringBootApplication
public class FanliMemberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanliMemberServiceApplication.class, args);
    }

}
