package com.xulingjue.traffictestserver.servlet.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

public class QuestionDAOHibernate extends HibernateDaoSupport implements
		QuestionDAO {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("ha ha success!");
	}
}
