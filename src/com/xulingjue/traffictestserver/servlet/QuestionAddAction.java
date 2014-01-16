package com.xulingjue.traffictestserver.servlet;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class QuestionAddAction extends ActionSupport{
	private String content;
	private String options[];
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	
	//处理用户请求的方法
	public String execute(){
		for(int i=0;i<this.options.length;i++){
			System.out.println(this.options[i]);
		}
		
		return SUCCESS;
	}
}
