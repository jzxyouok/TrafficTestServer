package com.xulingjue.traffictestserver.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

import com.xulingjue.traffictestserver.pojo.Question;
import com.xulingjue.traffictestserver.pojo.Selection;

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

	@Override
	public ArrayList findBySelection(Selection selection) {
		ArrayList personList = (ArrayList) getHibernateTemplate().find("select q from Question q left join q.selections s where s.id = 6");
		return personList;
	}
}
