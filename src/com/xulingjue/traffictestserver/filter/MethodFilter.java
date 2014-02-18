package com.xulingjue.traffictestserver.filter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MethodFilter extends MethodFilterInterceptor{
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		System.out.println("MethodFilter is working!");
		String result = invocation.invoke();
		return result;
	}

}
