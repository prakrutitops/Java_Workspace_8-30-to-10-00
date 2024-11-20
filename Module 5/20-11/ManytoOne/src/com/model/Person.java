package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="person4")
public class Person 
{
	@Id
	@GenericGenerator(name="increment",strategy="increment")
	@GeneratedValue(generator="increment")
	@Column(name="pid")
	private int id;
	
	
	@Column(name="pname")
	private String name;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany
	List<Address>listaddress;


	public List<Address> getListaddress() {
		return listaddress;
	}


	public void setListaddress(List<Address> listaddress) {
		this.listaddress = listaddress;
	}
	
	
	
	
	
	
}
