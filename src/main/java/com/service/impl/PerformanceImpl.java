package com.service.impl;

import com.service.Performance;
import org.springframework.stereotype.Component;

/**
 * Created by XiuYin.Cui on 2017/12/11.
 */
@Component
public class PerformanceImpl implements Performance {


    public void perform() {
        System.out.println("this is show time");
    }
}
