package com.a39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student implements Comparable<Student>
{
	
	int id;
	String sname;
	
	public Student(int id,String sname) 
	{
		this.id=id;
		this.sname=sname;
	}

	@Override
	public int compareTo(Student o) 
	{
		int value=0;
		
		if(this.id>o.id) 
		{
			return 1;
		}
		else if (this.id<o.id)
		{
			return -1;
		}
		else if(this.id==o.id)
		{
			return 0;
		}
	
		return 0;
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args)
	{
		Student s1 = new Student(101,"abcd");
		Student s2 = new Student(104,"abcd");
		Student s3 = new Student(103,"abcd");
		Student s4 = new Student(102,"abcd");
		
		
		ArrayList<Student>arr1 = new ArrayList<>();
		
		arr1.add(s1);
		arr1.add(s2);
		arr1.add(s3);
		arr1.add(s4);
		
		Collections.sort(arr1);
		
		
		for(Student s : arr1)
		{
			System.out.println("Id : - "+s.id+"  Name : - "+s.sname);
		}
		
	}
}
