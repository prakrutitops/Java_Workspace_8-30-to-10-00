package com.a88;

class RBI
{
	int roi()
	{
		return 0;
	}
}
class Sbi extends RBI
{
	int roi()
	{
		return 7;
	}
}
class Icici extends RBI
{
	int roi()
	{
		return 8;
	}
}
class Axis extends RBI
{
	int roi()
	{
		return 9;
	}
}



public class OverridingEx 
{
	public static void main(String[] args) 
	{
		
		RBI r;//refrence variable
		
		r = new Sbi();
		System.out.println(r.roi());
		
		r = new Icici();
		System.out.println(r.roi());
		
		r = new Axis();
		System.out.println(r.roi());
		
		
		
	}
}
