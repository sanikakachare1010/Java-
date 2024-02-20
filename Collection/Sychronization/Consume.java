package com.sgm.synchronization;

public class Consume extends Thread
{
	Company c;
	public Consume(Company c) //copy constructor
	{
		this.c =c;
	}
	public void run()
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println("abc");
			c.consume();
			
		}
		
	}

}
