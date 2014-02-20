package com.xulingjue.traffictestserver.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xulingjue.traffictestserver.pojo.Compute;

public class ComputeDAOHibernate extends HibernateDaoSupport implements ComputeDAO{

	@Override
	public int sub(int sub) {
		return 0;
	}

	@Override
	public Compute findById(int id) {
		// TODO Auto-generated method stub
		return (Compute)getHibernateTemplate().get(Compute.class, id);
	}

	@Override
	public void update(Compute compute) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(compute);
	}
	
	

}
