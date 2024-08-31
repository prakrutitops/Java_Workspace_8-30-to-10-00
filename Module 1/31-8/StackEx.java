package com.a318;

import java.util.Stack;

public class StackEx 
{
	//entry
	static void tpush(Stack st ,Integer i)
	{
		st.push(i);
		
		System.out.println(i);
		System.out.println(st);
	}
	//exit
	static void tpop(Stack st)
	{
		Integer i = (Integer) st.pop();
		
		System.out.println(i);
		System.out.println(st);
	}
	
	public static void main(String[] args) 
	{
		Stack st = new Stack<>();
		
		tpush(st,10);
		tpush(st,20);
		tpush(st,30);
		tpush(st,40);
		
		try
		{
			tpop(st);
			tpop(st);
			tpop(st);
			tpop(st);
			tpop(st);
			tpop(st);
			tpop(st);
		}
		catch(Exception e)
		{
			System.out.println("Empty Data");
		}
		
	}
}
