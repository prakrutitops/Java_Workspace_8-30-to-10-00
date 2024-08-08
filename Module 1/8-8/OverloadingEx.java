package com.a88;

public class OverloadingEx 
{
	
	static int cal(int a,int b)
	{
		return a+b;
	}
	static double cal(float a,float b)
	{
		return a*b;
	}
	
	public static void main(String[] args)
	{
		System.out.println(cal(6, 5));
		System.out.println(cal(2.0F, 3.0F));
	}
}
