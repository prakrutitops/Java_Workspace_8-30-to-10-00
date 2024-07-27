package com.a277;

import java.util.Scanner;

public class SumEx 
{
	public static void main(String[] args) 
	{
		int sum =0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		
		while(num>0)
		{
			int rem = num%10;
			sum+=rem;//sum=sum+rem;
			num=num/10;
		}
		
		System.out.println("Sum of all digits: "+sum);
		
		
	}
}
