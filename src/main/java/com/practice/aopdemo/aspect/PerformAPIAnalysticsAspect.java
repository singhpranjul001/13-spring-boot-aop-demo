package com.practice.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class PerformAPIAnalysticsAspect {

    @Before("com.practice.aopdemo.aspect.AopExpressions.forDaoAndNoGetterOrSetter()")
    public void performApiAnalytics(){
        System.out.println("\n===> Doing some API analytics.");
    }
}
