package com.xulingjue.traffictestserver.dao;

import com.xulingjue.traffictestserver.pojo.Compute;

public interface ComputeDAO {
	//
	int sub(int sub);
	Compute findById(int id);
	void update(Compute compute);
}
