package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Part;
import java.io.IOException;

/**
 * Created by Administrator on 2017/12/17.
 */
@Controller
public class HomeController {

    /*Model 实际上就是一个Map(也就是key-value对的集合)，它会传递给视图，这样数据就能渲染到客户端了
    * 当调用addAttribute()方法并且不指定key的时候，那么key会根据值的对象类型推断确定，比如 List<Spittle>
    * 那么推断他的 key 就是 spittleList。如果你希望使用非Spring类型的话，那么可以用java.util.Map来代 替Model。
    *
    * */
    @RequestMapping(value = "/picture",method = RequestMethod.POST)
    public String getHome(@RequestPart("picture") Part picture) throws IOException {
        picture.write("/"+picture.getSubmittedFileName());
        return "home";
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String getHome(){
        return "home";
    }

    @RequestMapping(value = "/listHome",method = RequestMethod.GET)
    public String listHome(@RequestParam(required = true,value = "size") int size){

        return "";
    }

    @RequestMapping(value = "/list/{size}",method = RequestMethod.GET)
    public String getHome(@PathVariable(value = "size") int size,Model model){

        return "";
    }
}
