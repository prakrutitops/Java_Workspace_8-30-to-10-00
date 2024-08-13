package com.a138;

class Sender
{
	public void send(String msg)
	{
		
		System.out.println("Sending "+msg);
		
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println(msg+" Sent");
		
	}
}
class Threadsend extends Thread
{
	Sender sender;
	String msg;
	
	public Threadsend(String msg,Sender sender) 
	{
		this.sender=sender;
		this.msg=msg;
	}
	
	@Override
	public void run() 
	{
		
		synchronized (sender) 
		{
			sender.send(msg);
		}
		
	}
}


public class SyncDemo 
{
	public static void main(String[] args) 
	{
		Sender sender = new Sender();
		
		Threadsend t1 = new Threadsend("Hii", sender);
		Threadsend t2 = new Threadsend("Byee", sender);
		
		t1.start();
		t2.start();
	}
}
