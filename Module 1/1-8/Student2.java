package com.a18;

public class Student2 
{
	//variables,data member	
	int id;
	String name;
	
	void show()
	{
		System.out.println("\n Your id is: "+id+" \n Your Name is: "+name);
	}
	
	
	public static void main(String[] args)
	{
		//object creation
		Student2 s1 = new Student2();
		
		//data assign
		s1.id=101;
		s1.name="avani";
		
		
		Student2 s2 = new Student2();
		
		//data assign
		s2.id=102;
		s2.name="vishv";
		
		s1.show();
		s2.show();
		
		
	}
}
