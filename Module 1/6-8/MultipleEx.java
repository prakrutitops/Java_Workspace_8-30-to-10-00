package com.a68;

interface M
{
	void m();
	
}
interface N
{
	void n();
	
}
class D implements M,N
{

	@Override
	public void n() {
		// TODO Auto-generated method stub
		System.out.println("N Called");
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("M Called");
	}

	
	
}

public class MultipleEx 
{
	public static void main(String[] args)
	{
		D d1 = new D();
		d1.m();
		d1.n();
		
	}
}	
