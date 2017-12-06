package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by XiuYin.Cui on 2017/12/2.
 */
@Component
public class StoreService {

    @Autowired
    private ShoppingCart shoppingCart;

    public void sys(){
        System.out.println(shoppingCart==null);
    }

}
