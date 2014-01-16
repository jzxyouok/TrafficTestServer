package com.xulingjue.traffictestserver.servlet.dao;

import java.util.ArrayList;

public class Question {
	private String content;
	private ArrayList<Selection> selections;
	private Selection answer;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ArrayList<Selection> getSelections() {
		return selections;
	}
	public void setSelections(ArrayList<Selection> selections) {
		this.selections = selections;
	}
	public Selection getAnswer() {
		return answer;
	}
	public void setAnswer(Selection answer) {
		this.answer = answer;
	}
}
