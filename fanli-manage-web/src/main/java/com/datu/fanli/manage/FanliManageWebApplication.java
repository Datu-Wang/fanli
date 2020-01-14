package com.datu.fanli.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author: datu
 * @date: 2020/1/11
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FanliManageWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanliManageWebApplication.class, args);
    }

}
