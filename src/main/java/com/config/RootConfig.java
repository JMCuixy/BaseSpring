package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Administrator on 2017/12/17.
 */
@Configuration
@ComponentScan(basePackages = {"com"},
        excludeFilters = { //指定哪些类型不适用组件扫描
            @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
        })
public class RootConfig {

        @Bean(name = "multipartResolver")
        public StandardServletMultipartResolver getStandardServletMultipartResolver(){
                return new StandardServletMultipartResolver();
        }
}
