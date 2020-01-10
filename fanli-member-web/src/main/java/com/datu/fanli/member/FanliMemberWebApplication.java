package com.datu.fanli.member;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: datu
 * @date: 2020/1/10
 */
@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan(value = "com.datu.fanli.member.service.impl")
public class FanliMemberWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanliMemberWebApplication.class, args);
    }

}
