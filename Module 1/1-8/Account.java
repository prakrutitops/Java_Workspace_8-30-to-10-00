package com.a18;

public class Account 
{
	 int count = 0;
	
	Account() 
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		
	}
}
