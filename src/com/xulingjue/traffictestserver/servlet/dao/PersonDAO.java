package com.xulingjue.traffictestserver.servlet.dao;

public interface PersonDAO {
	int add(Person person);
	Person findById(int id);
}
