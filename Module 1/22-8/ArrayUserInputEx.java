package com.a228;

import java.util.Scanner;

public class ArrayUserInputEx 
{
	public static void main(String[] args) 
	{
		
		int marks[] = new int[3];
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=0;i<3;i++)
		{
			

				if(i==0)
				{
					System.out.println("Enter Your Marks - Hindi");
				}
				if(i==1)
				{
					System.out.println("Enter Your Marks - Maths");
				}
				if(i==2)
				{
					System.out.println("Enter Your Marks - Science");
				}
				
				marks[i] = sc.nextInt();
			}
			
		
		
		for(int i=0;i<3;i++)
		{
			total+=marks[i];
			
		}
		
		System.out.println(total);
		
		
		
		
		
		
		
	}
}
