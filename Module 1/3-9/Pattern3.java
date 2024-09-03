package com.a39;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		
		int row,col,count=1;
		
		for(row=1;row<=4;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(count++);//*,#,row,col
			}
			System.out.println();
		}
		
	}
}
