package com.xulingjue.traffictestserver.servlet;

import com.opensymphony.xwork2.ActionSupport;
import com.xulingjue.traffictestserver.servlet.dao.Address;
import com.xulingjue.traffictestserver.servlet.dao.Person;
import com.xulingjue.traffictestserver.servlet.dao.PersonDAO;
import com.xulingjue.traffictestserver.servlet.dao.PersonDAOHibernate;

public class QuestionListAction extends ActionSupport {
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	// 处理action请求
	public String execute() {
		// person 写入请求
		Address address = new Address();
		address.setDetail("address detail");

		Person person = new Person();
		person.setName("just a test");
		person.setAddress(address);
		
		Person person2 = new Person();
		person2.setName("just a test2");
		person2.setAddress(address);

		personDAO.add(person);
		personDAO.add(person2);
		
		Person p = personDAO.findById(1);
		if(p!=null){
			System.out.println(p.getName());
			System.out.println(p.getAddress().getDetail());
		}
		
		
		return SUCCESS;
	}
}
