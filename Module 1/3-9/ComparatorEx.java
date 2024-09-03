package com.a39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp
{
	String ename;
	int salary;
	
	public Emp(String ename,int salary) 
	{
		this.ename=ename;
		this.salary=salary;
	}
}
class Student2 implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) 
	{
		int value = 0;
	
		if(o1.salary>o2.salary) 
		{
			return 1;
		}
		else if(o1.salary<o2.salary)
		{
			return -1;
		}
		else if(o1.salary==o2.salary)
		{
			return 0;
		}
		return value;
	}
	
}


public class ComparatorEx 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp("Drasti", 1000000);
		Emp e2 = new Emp("Lisha-1", 10000);
		Emp e3 = new Emp("Ashil-2", 20000);
		Emp e4 = new Emp("Bilal-3", 7000000);
		
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		al.add(e3);	
		al.add(e4);
		
		Collections.sort(al,new Student2());
		
		for(Emp e :al) 
		{
			System.out.println(e.salary+"   "+e.ename);
		}
		
	}
}
