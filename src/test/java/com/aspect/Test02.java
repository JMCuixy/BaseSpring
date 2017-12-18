package com.aspect;

import com.service.CompactDisc;
import com.service.Encoreable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by XiuYin.Cui on 2017/12/14.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test02 {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void test02(){
        compactDisc.playTrack(123);
        Encoreable compactDisc = (Encoreable) this.compactDisc; //当要调用添加的新功能的时候，这个用法相当于由代理转换到对应类实现，不会报类型转换错误
        compactDisc.performEncode();

    }
}