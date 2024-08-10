package com.a108;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx 
{
	public static void main(String[] args) throws IOException
	{
		
			String s = "welcome to tops2";
			FileOutputStream fout = new FileOutputStream("E://tops.txt");
			fout.write(s.getBytes());
			System.out.println("success");
	}
}
