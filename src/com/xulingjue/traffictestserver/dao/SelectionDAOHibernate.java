package com.xulingjue.traffictestserver.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.SessionFactory;

import com.xulingjue.traffictestserver.pojo.Selection;

public class SelectionDAOHibernate extends HibernateDaoSupport implements
		SelectionDAO {

	@Override
	public int add(Selection selection) {
		return (Integer)getHibernateTemplate()
				.save(selection);
	}

}
