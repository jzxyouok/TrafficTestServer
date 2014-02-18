package com.xulingjue.traffictestserver.filter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginFilter extends AbstractInterceptor{
	private boolean islogin = true;
	private String result = "";
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
				
		System.out.println("LoginFilter is working!");
		
		if(islogin){
			result = invocation.invoke();
		}else{
			result = "nologin";
		}
		
		return result;
	}

}
