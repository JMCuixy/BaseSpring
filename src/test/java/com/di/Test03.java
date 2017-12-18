package com.di;

import com.annotion.Creamy;
import com.service.Dessert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by XiuYin.Cui on 2017/12/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test03 {

    @Autowired
    @Creamy
    private Dessert dessert;

    @Test
    public void test03(){
        dessert.sys();
    }

}
