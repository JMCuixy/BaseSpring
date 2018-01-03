package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Created by Administrator on 2017/12/17.
 */
public class SplittrWebAppInitailzer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*返回会创建ContextLoaderListener 上下文*/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /*返回会创建 DispatcherServlet 上下文*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /*配置路径映射*/
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        //上传到/tmp/upload 目录，文件大小为2M，整个请求不超过4M，而且所有文件都要写入磁盘
        registration.setMultipartConfig(new MultipartConfigElement("E:\\upload_ftp",2097152,4194304,0));
    }

}
