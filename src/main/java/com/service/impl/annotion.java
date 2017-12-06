package com.service.impl;

import com.annotion.Creamy;
import com.service.Dessert;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by XiuYin.Cui on 2017/12/2.
 */
@Component
@Creamy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class annotion implements Dessert {
    public void sys() {
        System.out.println("this is my annotion");
    }
}
