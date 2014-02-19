package com.xulingjue.traffictestserver.struts.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;











import com.opensymphony.xwork2.ActionSupport;
import com.xulingjue.traffictestserver.dao.PersonDAO;
import com.xulingjue.traffictestserver.dao.PersonDAOHibernate;
import com.xulingjue.traffictestserver.dao.QuestionDAO;
import com.xulingjue.traffictestserver.pojo.Address;
import com.xulingjue.traffictestserver.pojo.Person;
import com.xulingjue.traffictestserver.pojo.Question;
import com.xulingjue.traffictestserver.service.PersonManager;

public class QuestionListAction extends ActionSupport {
	private PersonDAO personDAO;
	private QuestionDAO questionDAO;
	private InputStream inputStream;
	private PersonManager personManager;

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}
	
	public void setPersonManager(PersonManager personManager) {
		this.personManager = personManager;
	}
	
	

	// 处理action请求   执行ajax方法时也会执行该方法
	public String test() {
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
			System.out.println("---------------------------select address after person msg------------------");
			
			System.out.println(p.getAddress().getDetail());
		}
		
		
		return SUCCESS;
	}
	
	public String dbTest(){
		/*
		System.out.println("test start");
		Person person = personDAO.findByAddressId(0);
		
		if(person!=null)
			System.out.println(person.getAddress().getDetail());
		else
			System.out.println("no personId is 0");
		*/
		
		ArrayList questionList = questionDAO.findBySelection(null);
		if(questionList != null&&questionList.size()>0){
			for(int i=0;i<questionList.size();i++){
				Question q = (Question)questionList.get(i);
				System.out.println(q.getContent());
			}
		}else{
			System.out.println("no result select");
		}
		
		return SUCCESS;
	}
	
	/*
	 * ajax demo
	 */
	public String ajax(){
		try {
			personManager.add(0, "", "");
			
			inputStream = new ByteArrayInputStream("ajax run success".getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			
		}
		
		return SUCCESS;
	}
	
	/*
	 * file download demo
	 */
	public void downLoad(){
		
	}
}
