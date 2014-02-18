package com.xulingjue.traffictestserver.dao;

import java.util.ArrayList;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xulingjue.traffictestserver.pojo.Person;

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

	@Override
	public Person findByAddressId(int id) {
		// TODO Auto-generated method stub
		ArrayList personList = (ArrayList) getHibernateTemplate().find("from Person p where p.address.id = 2");
		
		if(personList!=null&&personList.size()>0){
			for(int i=0;i<personList.size();i++){
				Person p = (Person)personList.get(0);
				System.out.println("dao login:"+p.getAddress().getDetail());
			}
			
			return (Person)personList.get(0);
		}
		
		return null;
	}

}
