package com.a318;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args)
	{
		
		Vector v = new Vector<>(5);
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("d");
		v.add("d");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("d");
		v.add("d");
		
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Size: "+v.size());
		
		System.out.println(v.contains("e"));
		//System.out.println(v.);
		
		
	}
}
