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
	
	//pointcut ����
	@Pointcut("execution(public void checkLogin())")
	void before() {}
	
	@Before("before()")
	public void login() {
		System.out.println("====Befor Login=====");
	}
	
	//�޼ҵ� ȣ�� �� ������ �߻��� ������� ����
	@After("execution(* com.test.service.Bank.*(..))")
	public void after() {
		System.out.println("====After=====");
	}
	
	//���� �߻� �� ����, ���� �Ѱ� �ޱ����� throwing='ex'
	@AfterThrowing(pointcut="execution(public void transfer())", throwing="ex")
	public void afterThrowing(Throwable ex) {
		System.out.println("=====After Throwing=====");
		System.out.println(ex.toString());
		
	}
	
	//�޼ҵ� ȣ�� ���� ����
	@AfterReturning("execution(* confirm(..))")
	public void afterReturning() {
		System.out.println("=====After Returning=====");
	}
	
	
}
