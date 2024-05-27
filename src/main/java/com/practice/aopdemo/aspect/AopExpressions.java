package com.practice.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

    //Pointcut declaration
    @Pointcut("execution(* com.practice.aopdemo.dao.*.*(..))")
    public void forDaoPackage() {}

    //create a pointcut for getter methods
    @Pointcut("execution(* com.practice.aopdemo.dao.*.get*(..))")
    public void forGetter() {}

    //create a pointcut for setter methods
    @Pointcut("execution(* com.practice.aopdemo.dao.*.set*(..))")
    public void forSetter() {}

    //create a pointcut: include package... exclude getter/setter
    @Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
    public void forDaoAndNoGetterOrSetter() {}

}
