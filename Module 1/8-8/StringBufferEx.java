package com.a88;

public class StringBufferEx 
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("Hello");
		//s1.append("Java");
		
		//s1.insert(1, "tops");
		//s1.replace(1, 3, "java");
		//s1.delete(1,3);
		s1.reverse();
		System.out.println(s1);
	}
}
