package com.xulingjue.traffictestserver.dao;

import com.xulingjue.traffictestserver.pojo.Address;

public interface AddressDAO {
	int add(Address address);
	Address findById(int id);
}
