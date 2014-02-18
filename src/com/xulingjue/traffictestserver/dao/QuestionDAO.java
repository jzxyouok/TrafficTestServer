package com.xulingjue.traffictestserver.dao;

import java.util.ArrayList;

import com.xulingjue.traffictestserver.pojo.Question;
import com.xulingjue.traffictestserver.pojo.Selection;

public interface QuestionDAO {
	int add(Question question);
	void del(Question question);
	ArrayList findBySelection(Selection selection);
}
