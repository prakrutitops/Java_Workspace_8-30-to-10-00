package com.a68;

import java.util.Scanner;

public class Task1 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Single character: ");
		String a = sc.next();
		//char b = sc.next().charAt(0);
		if(a.length()>1)
		{
			System.out.println("Please Enter Single character only");
		}
		else
		{
			char c = a.charAt(0);
			//System.out.println(c);
			if()
			{
				if(c=='a' || c=='e' || c== 'i' || c=='o' || c=='u' || c=='A' || c=='E' || c== 'I' || c=='O' || c=='U')
				{
					System.out.println("It's a vowel");
				}
				else
				{
					System.out.println("It's a Consonant");
				}
			}
			else
			{
				System.out.println("Please Enter Value Between A to Z");
			}
			
			
		}
		
	}
}
