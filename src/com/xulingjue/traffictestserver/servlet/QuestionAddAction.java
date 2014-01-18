package com.xulingjue.traffictestserver.servlet;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class QuestionAddAction extends ActionSupport {
	private String act;

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	// 处理用户请求的方法
	public String execute() {
		if(act==null||act.trim().equals("")){
			return "showForm";
		}
		
		return SUCCESS;
	}
}
