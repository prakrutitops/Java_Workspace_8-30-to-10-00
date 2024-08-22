package com.a228;

public class CopyArrayEx 
{
	public static void main(String[] args) 
	{
		
		int A[] = {10,20,30,40,50};
		
		int B[] = new int[10];
		
		System.arraycopy(A,1,B,2,3);
		
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]);
		}
		
	}
}
