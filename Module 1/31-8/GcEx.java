package com.a318;

public class GcEx 
{
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Garbage Collection Called");
	}
	
	public static void main(String[] args) 
	{
		GcEx g1 = new GcEx();
		GcEx g2 = new GcEx();
		GcEx g3 = new GcEx();
		GcEx g4 = new GcEx();
		
		g1 =null;
		g2 =null;
		g3 =null;
		
		System.gc();
	
	}
}
