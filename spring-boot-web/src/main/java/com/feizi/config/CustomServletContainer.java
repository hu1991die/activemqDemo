/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.config;

import org.springframework.boot.context.embedded.Compression;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;

/**
 * @Desc 自定义实现配置tomcat容器
 * @Author feizi
 * @Date 2016/12/29 14:53
 * @Package_name com.feizi.config
 */
@Component
public class CustomServletContainer implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8082);
        container.setContextPath("/home");
        container.setDisplayName("飞子你好");
        Compression compression = new Compression();
        compression.setEnabled(true);
        container.setCompression(compression);

        container.setServerHeader("http");
        container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
        container.setSessionTimeout(10, TimeUnit.MINUTES);
    }
}
