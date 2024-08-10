package com.a108;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx 
{
	public static void main(String[] args) throws IOException
	{
		
		Student s1 = new Student(101,"abcd");
		FileOutputStream fout = new FileOutputStream("E://xyz.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		System.out.println("success");
		
		
	}
}
