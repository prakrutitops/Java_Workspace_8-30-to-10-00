package com.a88;

public class extraStrings 
{
	public static void main(String[] args) 
	{
		
		String s1 = "sachin";
		String s2 = "TOPS";
		String s3 ="  java  ";
		String s4 ="Java is a Platform,Java is a technology";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.trim());
		System.out.println(s1.startsWith("s"));
		System.out.println(s1.endsWith("q"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
		
		System.out.println(s4.replace("Java","Tops"));
		
	}
}
