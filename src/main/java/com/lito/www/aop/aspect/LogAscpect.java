package com.lito.www.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect
@Component
@Log4j
public class LogAscpect {
  
  @Around("@annotation(com.lito.www.aop.anntotation.LogExecutionTime)")
  public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
      long start = System.currentTimeMillis();
   
      Object proceed = joinPoint.proceed();
   
      long executionTime = System.currentTimeMillis() - start;
   
      log.info(joinPoint.getSignature() + " executed in " + executionTime + "ms");
      return proceed;
  }
  
}
