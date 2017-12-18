package com.aspect;

import org.aspectj.lang.annotation.*;

/**
 * Created by XiuYin.Cui on 2017/12/11.
 */
public class AudienceXML {

    public void  silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }
    public void takeSeats(){
        System.out.println("Taking seats");
    }
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
