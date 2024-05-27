package com.practice.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LogIntoCloudAsyncAspect {

    @Before("com.practice.aopdemo.aspect.AopExpressions.forDaoAndNoGetterOrSetter()")
    public void logInCloudAsync(){
        System.out.println("\n===> Logging into cloud in Async fashion.");
    }
}
