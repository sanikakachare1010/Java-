package com.sgm.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Wrapper
{
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		//HashSet a = new HashSet();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		
		Iterator itr = a.iterator();
		while(itr.hasNext())
		   {
			  
			  Object o =itr.next();
			   System.out.println(o);
		   }
		    
		
	}

}
