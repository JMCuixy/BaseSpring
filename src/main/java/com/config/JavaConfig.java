package com.config;

import com.aspect.Audience;
import com.aspect.AudienceXML;
import com.util.Base64Util;
import com.util.Base64UtilExpand;
import com.util.DateUtil;
import com.util.MongoUtil;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by XiuYin.Cui on 2017/11/27.
 */
@Configuration
@EnableAspectJAutoProxy //启用Aop自动代理
@PropertySource("classpath:mongo.properties")
public class JavaConfig {



    @Bean(name = "base64Util")
    public Base64Util getBase64Util(){
        return new Base64Util();
    }

    @Bean(name = "base64UtilExpand") //这种显示配置默认的Bean名是方法名。所以最好显示配置一下
    public Base64UtilExpand getBase64UtilExpand(){
        //对于这种创建的bean需要引用其他的bean。Spring是这样处理的：当引用到还没创建的bean的时候，Spring会拦截下这个引用，等到引用的bean的创建完成。已保证Spring bean的单例模式.
        return new Base64UtilExpand(getBase64Util());
    }

    @Bean(name = "base64UtilExpand")
    public Base64UtilExpand getBase64UtilExpand(Base64Util base64Util){
        return new Base64UtilExpand(base64Util);
    }

    @Bean(name = "dateUtil")
    @Conditional(TestCondition.class)
    public DateUtil getDateUtil(){
        return new DateUtil();
    }

    @Bean(name = "mongoUtil")
    public MongoUtil getMongoUtil(Environment env){
        return new MongoUtil(env.getProperty("mongo.host"),
                env.getProperty("mongo.port"),
                env.getProperty("mongo.database"),
                env.getProperty("mongo.username"),
                env.getProperty("mongo.password"));
    }


    @Bean(name = "propertySourcesPlaceholderConfigurer")
    public PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public AudienceXML getAudience(){
        return new AudienceXML();
    }


}
