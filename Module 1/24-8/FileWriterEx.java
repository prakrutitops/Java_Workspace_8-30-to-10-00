package com.a248;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx 
{
	
	
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("E://a.txt");
		fw.write("udhajkdhjdhajdh");
		fw.close();
		
		FileReader fi = new FileReader("E://a.txt");
		fi.read();
		int i=0;
		while((i=fi.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}

