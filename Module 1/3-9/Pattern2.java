package com.a39;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		
		int row,col,space;
		
		//row
		for(row=1;row<=5;row++)
		{
			//space
			for(space=0;space!=(5-row);space++)
			{
				System.out.print(" ");
			}
			
			//col
			for(col=1;col<=row;col++)
			{
				System.out.print(col);
			}
			
			System.out.println();
		}
		
	}
}
