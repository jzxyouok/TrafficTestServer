package com.xulingjue.traffictestserver.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;
import org.springframework.aop.MethodBeforeAdvice;

public class LogAspect implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before "+arg0+" method!");
		
	}
}
