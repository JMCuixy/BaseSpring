package com.service.impl;

import com.service.Dessert;
import org.springframework.stereotype.Component;



/**
 * Created by XiuYin.Cui on 2017/12/1.
 */
@Component("iceCream")
public class IceCream implements Dessert {
    public void sys() {
        System.out.println("this is IceCream");
    }
}
