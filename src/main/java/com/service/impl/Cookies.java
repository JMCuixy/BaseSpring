package com.service.impl;

import com.service.Dessert;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by XiuYin.Cui on 2017/12/1.
 */
@Component
@Qualifier("cookies")
public class Cookies implements Dessert {
    public void sys() {
        System.out.println("this is Cookies");
    }
}
