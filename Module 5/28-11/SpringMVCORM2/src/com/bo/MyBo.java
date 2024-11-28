package com.bo;

import java.util.List;

import com.dao.MyDao;
import com.model.Person;

public class MyBo 
{
	MyDao dao;

	public MyDao getDao() {
		return dao;
	}

	public void setDao(MyDao dao) {
		this.dao = dao;
	}
	
	public void insert(Person p)
	{
		dao.insert(p);
	}
	public List<Person> view()
	{
		return dao.view();
	}
	public void delete(Person p)
	{
		dao.delete(p);
	}
	public Person getPersonById(int id)
	{
		
		return dao.getPersonById(id);
	}
	
	public void update(Person p)
	{
		dao.update(p);
	}
}
