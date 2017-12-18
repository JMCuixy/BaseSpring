package com.di;

import com.config.JavaConfig;
import com.service.Dessert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by XiuYin.Cui on 2017/12/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = JavaConfig.class) 加载配置类
@ContextConfiguration(locations = "classpath:applicationContext.xml") //加载配置文件
public class Test02 {

    @Resource(name = "iceCream")
    private Dessert dessert;

    @Test
    public void test02(){
        dessert.sys();
    }

}
