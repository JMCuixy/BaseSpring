package com.mvc;


import com.controller.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Created by XiuYin.Cui on 2017/12/18.
 */
public class Test02 {

    /**
     * 我们不是直接调用home()方法并测试它的返回值，而是发起了对“/”的GET请求，并断言结果视图的名称为home。它首先传
     递一个HomeController实例到MockMvcBuilders.standaloneSetup()并调用build()来构建MockMvc实例。然后它使用MockMvc实例来执行针对“/
     ”的GET请求并设置期望得到的视图名称。
     */
    @Test
    public void testHomePage() throws Exception {
        HomeController homeController=new HomeController();
        //搭建MockMVC
        MockMvc build = standaloneSetup(homeController)
                .setSingleView(new InternalResourceView("/WEB-INF/pages/home.jsp"))
                .build();
        //对 “/home” 执行GET 请求，预期得到home视图
        build.perform(get("/home"))
                .andExpect(view().name("home"))
                .andExpect(model().attributeExists("spittleList"));
    }
}
