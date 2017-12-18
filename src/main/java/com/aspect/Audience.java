package com.aspect;

import org.aspectj.lang.annotation.*;

/**
 * Created by XiuYin.Cui on 2017/12/11.
 */
@Aspect //表示这是一个切面类
public class Audience {

    //使用简明的PointCut
    @Pointcut("execution(* com.service.Performance.perform(..))")
    public void performance(){}

    //前置通知 即 @Before("execution(* com.service.Performance.perform(..))")
    @Before("performance()")
    public void  silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }
    //前置通知 即 @Before("execution(* com.service.Performance.perform(..))")
    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    //方法调用结束通知(并不是指返回值通知，即使是void的返回值，仍然会触发通知) 即 @AfterReturning("execution(* com.service.Performance.perform(..))")
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    //有异常抛出的时候通知，即 @AfterThrowing("execution(* com.service.Performance.perform(..))")
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
