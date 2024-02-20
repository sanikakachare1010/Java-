package com.sgm.synchronization;

public class Produce extends Thread
{
	Company c;
	
	public Produce(Company c)
	{
		this.c = c;
		
	}
	public void run()
	{
		for(int i =1;i<=10;i++) 
		{
			System.out.println("Pqr");
		    c.produce(i);
		    
		}
		
	}

}
