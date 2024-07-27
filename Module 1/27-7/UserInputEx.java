package com.a277;

import java.util.Scanner;

public class UserInputEx 
{
	public static void main(String[] args) 
	{
		
		//how to create an object
		//classname objname = new classname();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Salary");
		double salary = sc.nextDouble();
		
		System.out.println("\n Your id is: "+id+" \n Your Name is: "+name+" \n Your Salary is: "+salary);
		
		if(salary>25000)
		{
			System.out.println("You have to pay TAX");
		}
		else
		{
			System.out.println("No need to pay TAX");
		}
		
		
		
		
	}
}
