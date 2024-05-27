package com.practice.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    //this is where we add all of our related advices for logging

    //let's start with on @Before advice

    //Pointcut declaration
    @Pointcut("execution(* com.practice.aopdemo.dao.*.*(..))")
    private void forDaoPackage() {}

    //create a pointcut for getter methods
    @Pointcut("execution(* com.practice.aopdemo.dao.*.get*(..))")
    private void forGetter() {}

    //create a pointcut for setter methods
    @Pointcut("execution(* com.practice.aopdemo.dao.*.set*(..))")
    private void forSetter() {}

    //create a pointcut: include package... exclude getter/setter
    @Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
    private void forDaoAndNoGetterOrSetter() {}


    @Before("forDaoAndNoGetterOrSetter()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n ====> Executing @Before advice on method.");
    }

    @Before("forDaoAndNoGetterOrSetter()")
    public void performApiAnalytics(){
        System.out.println("\n===> Doing some API analytics.");
    }
}
