package com.a228;

public class FundEx 
{
	int deposite,withdraw;
	int totalbal=0;
	
	public int balance()
	{
		return totalbal;
	}
	
	public void deposite(int amount)
	{
		totalbal += amount;
	}
	
	public void withdraw(int amount) throws InSufficientFundException
	{
		if(amount>totalbal)
		{
			throw new InSufficientFundException(String.format("Sorry, insufficient balance, you need more %d Rs.\nTo perform "
					+ "this transaction",(amount-totalbal)));
		}
		else
		{
			totalbal-=amount;
		}
	}
	
	public static void main(String[] args) 
	{
		
		FundEx f1 = new FundEx();
		f1.deposite(18000);
		f1.withdraw(28000);
		System.out.println("Withdraw succesful : remaining balance is "+f1.balance());
		
	}
	
}
