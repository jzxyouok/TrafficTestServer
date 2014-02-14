package com.xulingjue.traffictestserver.servlet.dao;

public interface AddressDAO {
	int add(Address address);
	Address findById(int id);
}
