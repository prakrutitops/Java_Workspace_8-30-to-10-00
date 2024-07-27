package com.a277;

import java.util.Scanner;

public class MaxEx 
{
	public static void main(String[] args) 
	{
		int max =0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		
		while(num>0)
		{
			int rem = num%10;//1//8//7
			
			if(rem>max)
			{
				max = rem;//1//8
			}
			num=num/10;
			
			
		}
		
		System.out.println("Max Num is: "+max);
		
		
	}
}
