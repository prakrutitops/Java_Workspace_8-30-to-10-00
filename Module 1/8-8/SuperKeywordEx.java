package com.a88;

class Mycolor
{
	String color="black";
}
class Mycolor2 extends Mycolor
{
	String color="white";
	
	
	void display()
	{
		System.out.println(color);//current class value
		System.out.println(super.color);//parent class value
	}
}


public class SuperKeywordEx 
{
	public static void main(String[] args)
	{
		Mycolor2 m2 = new Mycolor2();
		m2.display();
	}
}
