package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by XiuYin.Cui on 2018/1/4.
 */
@Controller
public class ExceptionController {

    @RequestMapping(value = "/exception",method = RequestMethod.GET)
    public String testException(){

        return "home";
    }


}
