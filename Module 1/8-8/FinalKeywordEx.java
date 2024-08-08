package com.a88;

//class A
//{
//	final void a()
//	{
//		
//	}
//}
//class B extends A
//{
//	void a()
//	{
//		
//	}
//}
//


public class FinalKeywordEx 
{
	
	static final void a(int a1,int a2)
	{
		a1=20;
		System.out.println(a1);
	}
	static void a(int a2)
	{
		a2=20;
		System.out.println(a2);
	}
	static final void a()
	{
		System.out.println("a");
	}
	
	
	public static void main(String[] args) 
	{
		
		//final variable,method and class
		//static variable,method,block
		
		final int speed = 90;//final variable
		//speed=120;
		System.out.println(speed);
		
		
		a(10);
		a();
	}
}
