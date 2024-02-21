package com.sgm.comparative;

import java.util.Comparator;

public class SortById implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
        int i = o1.getId()-o2.getId();
		return i;
	}
	

}
