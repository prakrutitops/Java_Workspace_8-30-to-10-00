package com.a68;

class A
{
	void a()
	{
		System.out.println("a called");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("b called");
	}
}

public class SingleInEx 
{
	public static void main(String[] args) 
	{
		
		B b1 = new B();
		
		b1.a();
		b1.b();
	}
}
