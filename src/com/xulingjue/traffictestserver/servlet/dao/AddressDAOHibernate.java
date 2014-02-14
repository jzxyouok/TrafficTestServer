package com.xulingjue.traffictestserver.servlet.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class AddressDAOHibernate  extends HibernateDaoSupport implements AddressDAO {

	@Override
	public int add(Address address) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate()
				.save(address);
	}

	@Override
	public Address findById(int id) {
		// TODO Auto-generated method stub
		return (Address) getHibernateTemplate().get(Address.class, id);
	}

}
