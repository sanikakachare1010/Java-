package com.sgm.synchronization;

public class Main
{
	public static void main(String[] args) 
	{
		Company comp = new Company();
		Produce p = new Produce(comp);
		Consume c =new Consume (comp);
		
		p.start();
		c.start();
		
		
		
	}

}
