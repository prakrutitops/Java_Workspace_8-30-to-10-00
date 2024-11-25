package com.bo;

import com.dao.Dao;
import com.model.Person;

public class Bo 
{
	Dao dao;
	
	
	
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	public void insert(Person p)
	{
		dao.insert(p);
	}
	public void update(Person p)
	{
		dao.update(p);
	}
	public void delete(Person p)
	{
		dao.delete(p);
	}
}
