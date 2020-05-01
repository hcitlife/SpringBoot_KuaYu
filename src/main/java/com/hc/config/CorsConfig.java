package com.hc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("addCorsMappings");
        registry.addMapping("/**")
                .allowedOrigins("*") // 允许任何域名使用
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS") // 允许的方法
                .allowCredentials(true)
                .maxAge(3600)
                .allowedHeaders("*"); // 允许任何头
    }

}