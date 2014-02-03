package com.xulingjue.traffictestserver.servlet.dao;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

public class QuestionDAOHibernate extends HibernateDaoSupport implements
		QuestionDAO {

	@Override
	public int add(Question question) {
		// TODO Auto-generated method stub
		System.out.println("ha ha success!");
		return (Integer)getHibernateTemplate()
				.save(question);
	}
	
	@Override
	public void del(Question question){
		getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session arg0) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
}
