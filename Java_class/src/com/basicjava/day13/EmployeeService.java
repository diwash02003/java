package com.basicjava.day13;

public class EmployeeService {

	private Employee employee;
	
	public EmployeeService(Employee employee) {
		this.employee=employee;
	}
	
	

	public   void displayEmployee() {
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getIncome());
		System.out.println(employee.getTax());

	}
	
	
}
