package com.sgm.comparative;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main 
{
        public static void main(String[] args) 
        {
        	HashMap<String,Employee> hm = new HashMap(); // Random Output
        	
        	Employee e1 = new Employee(1,"Akash",80000,"HR");
        	
        	Employee e2 = new Employee();
        	e2.setId(2);
        	e2.setName("Harry");
        	e2.seteSalary(80000);
        	e2.setDepartment("Developer");
        	
        	Employee e3 =  new Employee(3,"Sakshi",8000,"Management");

        	Employee e4 = new Employee(4,"Neha",90000,"Tranner");
        	
        	String k1 = "abc";
        	String  k2 = "pqr";
        	String k3 = "xyz";
        	String k4 = "bcd";
        	
        	hm.put(k1, e1);
        	hm.put(k2, e2);
        	hm.put(k3, e3);
        	hm.put(k4, e4);
        	hm.put("k5",new Employee (5,"Sarika",600000,"HR"));
        	System.out.println(hm);
        	
        	Collection<Employee> c = hm.values();
        	
        	System.out.println("-----------------------------------");
        	
        	for(Employee emp : c)
        	{
        		System.out.println(emp);
        	}
        	System.out.println("------------Sort By Id----------------");
        	
        	ArrayList<Employee> al = new ArrayList(c);
        	
        	
        	Collections.sort(al,new SortById());
        	
        	for(Employee emp :al)
        	{
        		System.out.println(emp);
        	}
        	
        	System.out.println("------------Sort By Name----------------");
        	
        	Collections.sort(al, new SortByName());
        	
        	for(Employee emp : al)
        	{
        		System.out.println(emp);
        		
        	}
        	System.out.println("------------Sort By Salary----------------");
        	
        	Collections.sort(al,new SortBySalary());
        	
        	for(Employee emp : al)
        	{
        		System.out.println(emp);
        	}

        	

        	
        	
			
		}
}
