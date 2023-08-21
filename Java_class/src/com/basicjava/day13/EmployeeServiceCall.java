package com.basicjava.day13;

public class EmployeeServiceCall {
	
	public static void main(String[] args) {
		
		Employee E =new Employee();
		E.setId(1);
		E.setName("Diwash");
		E.setIncome(24343);
		E.setTax(1333);
		
		EmployeeService employeeService = new EmployeeService(E);
		employeeService.displayEmployee();
	}
}
