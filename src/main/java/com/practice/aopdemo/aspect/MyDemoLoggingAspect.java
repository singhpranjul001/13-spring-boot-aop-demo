package com.practice.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

    @Before("com.practice.aopdemo.aspect.AopExpressions.forDaoAndNoGetterOrSetter()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n ====> Executing @Before advice on method.");
    }

}
