package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class MyDao extends HibernateDaoSupport
{

	public void insert(Person p)
	{
		this.getHibernateTemplate().save(p);
	}
	
	public List<Person> view()
	{
		List<Person> getlist = this.getHibernateTemplate().find("from Person");
		return getlist;
	}
	
	public void delete(Person p)
	{
		this.getHibernateTemplate().delete(p);
	}
	
}
