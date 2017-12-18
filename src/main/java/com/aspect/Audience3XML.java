package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by XiuYin.Cui on 2017/12/11.
 */
public class Audience3XML {

    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        System.out.println("Silencing cell phones");
        System.out.println("Taking seats");
        try {
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
            throwable.printStackTrace();
        }
    }
}
