package com.datu.fanli.member;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 取消自动配置数据库
 * @author: datu
 * @date: 2020/1/10
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FanliMemberWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanliMemberWebApplication.class, args);
    }

}
