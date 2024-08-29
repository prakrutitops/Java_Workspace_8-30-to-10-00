package com.a298;

public class MyModel 
{
	String name,surname,email,mobile,city;

	
	MyModel(String name,String surname,String email) 
	{
		// TODO Auto-generated constructor stub
	
		this.name=name;
		this.surname=surname;
		this.email=email;
	}
	
	
	MyModel(String mobile,String city) 
	{
		// TODO Auto-generated constructor stub
		this.mobile=mobile;
		this.city=city;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "\n Your name is "+name+"\n Your Surname is "+surname+"\n Your Email is "+email+"\n Your Mobile is "+mobile+"\n Your City is "+city;
	}
	
}
