package com.a108;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx2 
{
	public static void main(String[] args) throws IOException
	{
		
		FileInputStream fin = new FileInputStream("E://tops.txt");
		int i = 0;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
	}
}
