package com.niit.junit;

public class Employee {
private int empId;
private String name;
private int salary;
public Employee() {
	
}
public Employee(int empId, String name, int salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
}
public boolean equals(Object obj)
{
	Employee emp=(Employee) obj;
	boolean status=false;
	if(this.name.equalsIgnoreCase(emp.name)
			&&this.empId==emp.empId
			&&this.salary==emp.salary)
	{
		status=true;
	}
	return status;
}
public static String getEmpNameWithHighestSalary()
{
	return "sharmistha";
}
public static Employee getHighestPaidEmployee()
{
	return new Employee(1, "sharmistha", 15000);
}
public int hashCode()
{
	return this.empId;
}
}

