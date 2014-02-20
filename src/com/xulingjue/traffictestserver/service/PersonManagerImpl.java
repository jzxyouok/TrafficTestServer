package com.xulingjue.traffictestserver.service;

import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.xulingjue.traffictestserver.dao.ComputeDAO;
import com.xulingjue.traffictestserver.pojo.Compute;

public class PersonManagerImpl implements PersonManager{
	private ComputeDAO computeDAO;
	
	public void setComputeDAO(ComputeDAO computeDAO) {
		this.computeDAO = computeDAO;
	}

	@Override
	public int add(int id, String name, String address) {
		// 检查信息是否合法		
		Compute c = computeDAO.findById(1);
		System.out.println("now the compute number is "+c.getTotal());
		
		// 测试事务控制
		c.setTotal(c.getTotal()+5);
		computeDAO.update(c);
		System.out.println(" try to rollback");
		
		//回滚
		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		
		return 0;
	}

}
