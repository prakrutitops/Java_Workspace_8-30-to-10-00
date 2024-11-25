package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class Dao extends HibernateDaoSupport
{
	public void insert(Person p)
	{
		this.getHibernateTemplate().save(p);
	}
	public void update(Person p)
	{
		this.getHibernateTemplate().update(p);
	}
	public void delete(Person p)
	{
		this.getHibernateTemplate().delete(p);
	}
}
