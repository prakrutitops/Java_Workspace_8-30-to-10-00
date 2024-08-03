package com.a38;

public class Student4 
{
	int id;
	String name;
	static String college="Atmiya";//static variable
	
	public Student4(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	//static method
	static void change()
	{
		college="VVP";
	}
	
	public static void main(String[] args)
	{
		Student4 s1 = new Student4(101,"a");
		Student4 s2 = new Student4(102,"b");
		Student4 s3 = new Student4(103,"c");
		Student4 s4 = new Student4(104,"d");
		
		//method calling
		change();
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
	
		
	}
}
