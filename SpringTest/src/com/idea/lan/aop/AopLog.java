package com.idea.lan.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopLog {
    public void runOnAround(ProceedingJoinPoint point) throws Throwable{

            System.out.println("核心功能运行前 run");
            point.proceed();
            System.out.println("核心功能运行后 run");

    }
}
