package com.service.impl;

import com.service.Dessert;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by XiuYin.Cui on 2017/12/1.
 */
@Component
@Primary
public class Cake implements Dessert {
    public void sys() {
        System.out.println("this is Cake");
    }
}
