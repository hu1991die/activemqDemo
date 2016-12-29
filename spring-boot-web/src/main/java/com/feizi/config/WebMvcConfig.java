/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Desc 自定义SpringMVC相关配置
 * @Author feizi
 * @Date 2016/12/29 15:52
 * @Package_name com.feizi.config
 */
@Configuration
//@EnableWebMvc //无需使用该注解，否则会覆盖掉SpringBoot的默认配置值
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello").setViewName("/hello");
    }
}
