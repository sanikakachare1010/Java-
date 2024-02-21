package com.sgm.comparative;

public class Employee 
{
	private int id;
	private String name;
	private long eSalary;
	private String department;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(int id, String name, long eSalary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.eSalary = eSalary;
		this.department = department;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", eSalary=" + eSalary + ", department=" + department + "]";
	}


}
