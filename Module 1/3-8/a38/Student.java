package com.a38;

public class Student 
{
	int id;
	String name;
	
	public Student(int i,String n) 
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student(101,"a");
		Student s2 = new Student(102,"b");
		Student s3 = new Student(103,"c");
		Student s4 = new Student(104,"d");
		
		//method calling
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	
		
	}
}
