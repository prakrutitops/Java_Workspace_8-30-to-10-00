package com.a248;

import java.io.File;
import java.io.IOException;

public class FileClassEx 
{
	public static void main(String[] args) throws IOException 
	{
		FileClassEx fcd = new FileClassEx();
		
		File file = new File("E://b.txt");
		file.createNewFile();
		
		fcd.getFileDetails(file);
		
		
	}

	private void getFileDetails(File file) 
	{
	
		System.out.println(file.exists());;
		System.out.println(file.isDirectory());;
		//System.out.println(file.lastModified());;
		System.out.println(file.getName());;
		System.out.println(file.getAbsolutePath());;
		System.out.println(file.getPath());;
		System.out.println(file.canExecute());;
		System.out.println(file.canRead());;
	}
}
