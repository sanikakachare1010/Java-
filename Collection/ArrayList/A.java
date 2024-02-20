package com.sgm.list.arraylist;
import java.util.*;
import java.util.Iterator;
public class A 
{
	
     public static void main(String[] args) 
     {
	        LinkedList l = new LinkedList();
	        
	        l.add(11);
	        l.add(34);
	        l.add("Abc");
	        l.add("Karad");
	        
	        System.out.println(l.set(1, "Satara")); // To update specific obj
	        System.out.println(l);
	        l.remove(1); // to remove specfic obj.
	        System.out.println(l);
	        
	        Iterator itr =l.iterator();
	         
	        while(itr.hasNext())
	        {
	        	Object o = itr.next();
	        	System.out.println(o);
	        	
	        }
      }
}
