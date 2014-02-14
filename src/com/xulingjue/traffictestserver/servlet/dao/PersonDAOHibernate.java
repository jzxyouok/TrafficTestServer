package com.xulingjue.traffictestserver.servlet.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PersonDAOHibernate  extends HibernateDaoSupport implements PersonDAO {

	@Override
	public int add(Person person) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate()
				.save(person);
	}

	@Override
	public Person findById(int id) {
		// TODO Auto-generated method stub
		return (Person)getHibernateTemplate().get(Person.class, id);
	}

}
