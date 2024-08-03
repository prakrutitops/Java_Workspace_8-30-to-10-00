package com.a38;

public class Student3 
{
	int id;
	String name;
	
	public Student3(int i,String n) 
	{
		id = i;
		name = n;
	}
	public Student3(Student3 s1) 
	{
		System.out.println(s1.id+" "+s1.name);
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	
	public static void main(String[] args)
	{
		Student3 s1 = new Student3(101,"a");
		Student3 s2 = new Student3(s1);
		
		s1.display();
		
	}
	
	
}
