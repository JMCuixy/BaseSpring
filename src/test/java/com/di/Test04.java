package com.di;

import com.annotion.Creamy;
import com.entity.ShoppingCart;
import com.entity.StoreService;
import com.service.Dessert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by XiuYin.Cui on 2017/12/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test04 {

    @Autowired
    private StoreService storeService;

    @Test
    public void test03(){
       storeService.sys();
    }

}
