package com.basicjava.day11;

public class CollectionOfEmployee {

	public static void main(String[] args) {
		
		EmployeeData[] EmployeeDataObj = new EmployeeData[2];
		
		EmployeeData emp1 =new EmployeeData();
		emp1.setEmployeeName("Diwash");
		emp1.setEmployeeAddress("ktm");
		emp1.setEmployeePhoneNo("9825990806");
		emp1.setEmployeeEmail("dpokhrel111@gmail.com");
		emp1.setEmployeeSalary(45678.0);
		
		EmployeeDataObj[0]=emp1;
		
		
		EmployeeData emp2 =new EmployeeData();
		emp2.setEmployeeName("pokhrel");
		emp2.setEmployeeAddress("kathmandu");
		emp2.setEmployeePhoneNo("9746870064");
		emp2.setEmployeeEmail("pdiwash111@gmail.com");
		emp2.setEmployeeSalary(54564.556599);
		
		EmployeeDataObj[1]=emp2;
		
		
		for(int i=0;i<EmployeeDataObj.length;i++) {
			EmployeeData data =EmployeeDataObj[i];
			System.out.println("Name: "+data.getEmployeeName());
			System.out.println("Address: "+data.getEmployeeAddress());
			System.out.println("Phonenum: "+data.getEmployeePhoneNo());
			System.out.println("email: "+data.getEmployeeEmail());
			System.out.println("salary: "+data.getEmployeeSalary());
			System.out.println();
		}
		
	}
	
}
