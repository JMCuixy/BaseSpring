package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by XiuYin.Cui on 2017/12/12.
 */

public class TrackCounter {

    private Map<Integer,Integer> trackCounts=new HashMap<Integer, Integer>();
    //@Pointcut("execution(* com.service.CompactDisc.playTrack(int)) && args(trackNumber)") //带入输入参数
    //@Pointcut("target(com.service.CompactDisc) && args(trackNumber)") // target 匹配目标对象（非AOP对象）为指定类型
    //@Pointcut("within(com.service..*) && args(trackNumber)") //com.service 包以及子包下的所有方法都执行
    //@Pointcut("within(com.service..CompactDisc+) && args(trackNumber)") //com.service 包的CompactDisc类型以及子类型
    // @Pointcut("this(com.service.CompactDisc) && args(trackNumber)") //匹配当前AOP代理对象类型,必须是类型全称，不支持通配符
     public void trackPlayed(int trackNumber){}

   // @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int playCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber,playCount+1);
        System.out.println(trackCounts.toString());
    }

    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }
}
