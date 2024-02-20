package com.sgm.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Vector;

import java.util.HashSet;
import java.util.*;
public class StudentList
{
	public static void main(String[] args)
	{
		ArrayList <String>a = new ArrayList();
		//HashSet a = new HashSet();
		
		//a.add("Sanika");
		//a.add("Nikita");
		//a.add(90);
		/*a.add("Sanika");
		a.add("Shital");
		a.add("Sakshi");
		a.add("Rohini");*/
		
	    System.out.println(a);
	    
	  /*/ System.out.println(a.get(0));//get is read method
	    System.out.println(a.get(1));
	    System.out.println(a.get(2));
	    System.out.println(a.get(3));
	    System.out.println(a.get(4));
	    System.out.println(a.get(5));
	    
	    System.out.println(a.size());
	    System.out.println(a.set(0, "Pratiksha")); // update
	    //System.out.println(a.get(0));
	    System.out.println(a.remove(0));
	    System.out.println(a.get(0));
	    //System.out.println(a.clear());
	    //System.out.println(a.clone());
	    //object a = a.clone();
	     * 
	     */
	    int rohiniIndex=a.indexOf("Rohini");
	    //System.out.println(a.indexOf("Rohini"));
	    System.out.println(rohiniIndex);
	    Iterator itr = a.iterator();
	    
	   while(itr.hasNext())
	   {
		   
		  Object o =itr.next();
		 // String = [String]
		   System.out.println(o);
	   }
	   
	  
	    System.out.println("-------------------------------------");
	    for(int i=0;i<a.size();i++)
	    {
	    	System.out.println(a.get(i));
	    }
		
	}

}
