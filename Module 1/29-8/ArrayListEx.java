package com.a298;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("android");
		arraylist.add("java");
		arraylist.add("php");
		arraylist.add("ios");
		arraylist.add("WD");
		
		ArrayList<String> arraylist2 = new ArrayList<>();
		arraylist2.add("DM");
		arraylist2.add("GD");
		arraylist2.add("WD");
		
		
//		arraylist.addAll(arraylist2);
//		
//		arraylist.remove(1);
//		arraylist.remove("php");
//		
//		arraylist.removeAll(arraylist2);
		
		arraylist.retainAll(arraylist2);
		
		//System.out.println(arraylist);
		//System.out.println(arraylist.get(1));
		
		Iterator i = arraylist.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
