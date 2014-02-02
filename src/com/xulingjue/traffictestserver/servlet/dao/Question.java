package com.xulingjue.traffictestserver.servlet.dao;

import java.util.Set;

public class Question {
	private int id;
	private String content;
	private String img;
	private Set<Selection> selections;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Set<Selection> getSelections() {
		return selections;
	}

	public void setSelections(Set<Selection> selections) {
		this.selections = selections;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
