package com.a38;

public class Student2 
{
	int id;
	String name;
	
	public Student2(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args)
	{
		Student2 s1 = new Student2(101,"a");
		Student2 s2 = new Student2(102,"b");
		Student2 s3 = new Student2(103,"c");
		Student2 s4 = new Student2(104,"d");
		
		//method calling
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	
		
	}
}
