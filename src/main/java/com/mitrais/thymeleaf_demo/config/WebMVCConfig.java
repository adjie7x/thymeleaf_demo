package com.mitrais.thymeleaf_demo.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.mitrais.thymeleaf_demo")
public class WebMVCConfig implements WebMvcConfigurer {


    private ApplicationContext applicationContext;


}
