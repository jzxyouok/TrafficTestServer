package com.xulingjue.traffictestserver.dao;

import com.xulingjue.traffictestserver.pojo.Person;

public interface PersonDAO {
	int add(Person person);
	Person findById(int id);
	Person findByAddressId(int id);
}
