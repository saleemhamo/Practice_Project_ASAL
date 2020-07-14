package com.example.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarServiceAspect {

	@Before(value = "execution(* com.example.demo.services.CarService.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Started Cars retrieving");
		
//		System.out.println("Creating Employee with name - " + name + " and id - " + empId);
	}

	@After(value = "execution(* com.example.demo.services.CarService.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully retrieved Cars");
	}
	
	
}
