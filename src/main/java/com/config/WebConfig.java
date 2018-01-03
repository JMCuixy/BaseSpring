package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Administrator on 2017/12/17.
 */
@Configuration
@EnableWebMvc //启用SpringMVC，当然也可以使用 <mvc:annotation-driven /> 注解驱动
@ComponentScan(basePackages = "com.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * 在查找的时候，它会在视图名称上加一个特定的前缀和后缀
     * （例如，名为home的视图将会解析为/WEB-INF/pages/home.jsp）。
     *
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        /*设置是否把所有在上下文中定义的bean作为request属性可公开访问。
          这样在JSP 2.0中可使用${}来存取，JSTL中使用c:out。
          默认为false。*/
        resolver.setExposeContextBeansAsAttributes(true);
        resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class); //设置解析JSTL
        return resolver;
    }

    /**
     * 通过调用DefaultServlet-HandlerConfigurer的enable()方法，
     * 我们要求DispatcherServlet将对静态资源的请求转发到Servlet容器
     * 中默认的Servlet上，而不是使用DispatcherServlet本身来处理此类请求
     *
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
