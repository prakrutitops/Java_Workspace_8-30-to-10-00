package com.a68;

class P
{
	void p()
	{
		System.out.println("P called");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q called");
	}
}
class R extends Q
{
	void r()
	{
		System.out.println("R called");
	}
}
class S extends R
{
	void s()
	{
		System.out.println("S called");
	}
}

public class MultilevelEx 
{
	public static void main(String[] args) 
	{
		S s = new S();
		s.p();
		s.q();
		s.r();
		s.s();
		
	}
}
