package com.a38;

public class DefaultConEx2 
{
	static int count = 0;
	
	public DefaultConEx2() 
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		DefaultConEx2 d1 = new DefaultConEx2();
		DefaultConEx2 d2 = new DefaultConEx2();
		DefaultConEx2 d3 = new DefaultConEx2();
	}
}
