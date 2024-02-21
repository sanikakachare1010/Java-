package com.sgm.comparative;
import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2)
	{
		int i = (int) (o2.geteSalary()-o1.geteSalary());
		
		return i;
	}

}
