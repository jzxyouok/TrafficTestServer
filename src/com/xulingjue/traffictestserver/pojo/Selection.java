package com.xulingjue.traffictestserver.pojo;

public class Selection {
	private int id;
	private int questionId;
	private String content;
	private int isRight;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsRight() {
		return isRight;
	}

	public void setIsRight(int isRight) {
		this.isRight = isRight;
	}
}
