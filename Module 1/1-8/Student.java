package com.a18;

public class Student 
{
	//variables,data member	
	int id;
	String name;
	
	public static void main(String[] args)
	{
		//object creation
		Student s1 = new Student();
		
		//data assign
		s1.id=101;
		s1.name="avani";
		
		
		Student s2 = new Student();
		
		//data assign
		s2.id=102;
		s2.name="vishv";
		
		//value display
		System.out.println("\n Your id is: "+s1.id+" \n Your name is : "+s1.name);
		System.out.println("\n Your id is: "+s2.id+" \n Your name is : "+s2.name);
		
	}
}
