package com.bl.io;

public class EmployeePayrollData {
	int id;
	String name;
	double salary;
	
	public EmployeePayrollData(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee Details: \nEmployee Id: "+id+"\nEmployee Name: "+name+"\nEmployee Salary: "+salary;
	}
}