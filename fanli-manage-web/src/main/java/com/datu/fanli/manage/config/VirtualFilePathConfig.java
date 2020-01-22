package com.datu.fanli.manage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: datu
 * @date: 2020/1/16
 */
@Configuration
public class VirtualFilePathConfig implements WebMvcConfigurer{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("getFile/pro_image/**").addResourceLocations("file:C:/Users/81519/Desktop/fanli/fanli-manage-web/src/main/resources/static/pro_image/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
