package com.test.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {
	
	//pointcut 설정
	@Pointcut("execution(public void checkLogin())")
	void before() {}
	
	@Before("before()")
	public void login() {
		System.out.println("====Befor Login=====");
	}
	
	//메소드 호출 후 예외의 발생에 관계없이 적용
	@After("execution(* com.test.service.Bank.*(..))")
	public void after() {
		System.out.println("====After=====");
	}
	
	//예외 발생 후 적용, 예외 넘겨 받기위한 throwing='ex'
	@AfterThrowing(pointcut="execution(public void transfer())", throwing="ex")
	public void afterThrowing(Throwable ex) {
		System.out.println("=====After Throwing=====");
		System.out.println(ex.toString());
		
	}
	
	//메소드 호출 이후 적용
	@AfterReturning("execution(* confirm(..))")
	public void afterReturning() {
		System.out.println("=====After Returning=====");
	}
	
	
}
