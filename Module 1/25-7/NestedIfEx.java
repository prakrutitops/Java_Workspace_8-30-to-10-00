package com.a257;

public class NestedIfEx 
{
	public static void main(String[] args)
	{
		int age = 67;
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
			
			if(age>=60)
			{
				System.out.println("You are Under Senior Citizen");
			}
			else
			{
				System.out.println("You are not Under Senior Citizen");
			}
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
	}
}
