package com.a318;

enum test1 
{
	John(11), Bella(10), Sam(13), Viraaj(9);
	
	private int age;

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	private test1(int age) 
	{
		this.age=age;
	}
	
	
}
public class test
{
	public static void main(String[] args) 
	{
		System.out.println(test1.Viraaj.getAge());
		
	}
}