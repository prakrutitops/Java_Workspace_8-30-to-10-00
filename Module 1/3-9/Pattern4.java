package com.a39;

public class Pattern4 
{
	public static void main(String[] args) 
	{
		
		int row,col;
		int i = 0;
		for(row=1;row<=4;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print((char)(row+64));//*,#,row,col
			}
			System.out.println();
		}
		
	}
}
