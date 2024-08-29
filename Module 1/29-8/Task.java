package com.a298;

import java.util.ArrayList;
import java.util.Iterator;

public class Task 
{
	public static void main(String[] args) 
	{
		
		ArrayList<MyModel> arr1 = new ArrayList<>();
		arr1.add(new MyModel("a","a","a@gmail.com"));
		arr1.add(new MyModel("b","b","b@gmail.com"));
		arr1.add(new MyModel("c","c","c@gmail.com"));
		
		ArrayList<MyModel> arr2 = new ArrayList<>();
		arr2.add(new MyModel("1234","rajkot"));
		arr2.add(new MyModel("5678","baroda"));
		arr2.add(new MyModel("8888","rajkot"));
		
		arr1.addAll(arr2);
	
		Iterator i = arr1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
