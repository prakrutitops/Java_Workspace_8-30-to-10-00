package com.a18;

public class Tops 
{
	//method
	void show()
	{
		System.out.println("a");
	}
	
	//constructor
	Tops() 
	{
		System.out.println("b");
	}
	
	public static void main(String[] args) 
	{
		Tops t1 = new Tops();//automatically constructor called
		
		//t1.show();
		
	}
}
