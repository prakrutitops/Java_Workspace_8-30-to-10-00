package com.a18;

import java.util.Scanner;

public class Student3 
{
	//variables,data member	
	static int id;
	static String name;
	
	void show()
	{
		System.out.println("\n Your id is: "+id+" \n Your Name is: "+name);
	}
	
	
	public static void main(String[] args)
	{
		//object creation
		Student3 s1 = new Student3();
		//Student3 s2 = new Student3();
		
		//Userinput
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your id");
		id = sc.nextInt();
		
		System.out.println("Enter Your Name");
		name = sc.next();
		
		s1.id=id;
		s1.name=name;
		
		s1.show();
		
		
		
	}
}
