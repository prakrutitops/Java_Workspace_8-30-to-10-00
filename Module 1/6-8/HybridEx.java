package com.a68;

class H
{
	void h()
	{
		System.out.println("h called");
	}
}
class I extends H
{
	void i()
	{
		System.out.println("i called");
	}
}
interface J 
{
	void j();
	
}
class K extends I implements J
{
	void k()
	{
		System.out.println("k called");
	}

	@Override
	public void j() 
	{
		// TODO Auto-generated method stub
		System.out.println("J cALLED");
	}
}

public class HybridEx 
{
	
	public static void main(String[] args) 
	{
		
		K k1 = new K();
		
		k1.h();
		k1.i();
		k1.j();
		k1.k();
		
	}
	
}
