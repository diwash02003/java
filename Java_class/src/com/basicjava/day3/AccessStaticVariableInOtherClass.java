package com.basicjava.day3;

public class AccessStaticVariableInOtherClass {
	public static void main(String[] args) {
		
		StaticVariableDemo.setdata();
		System.out.println("Age: "+StaticVariableDemo.age);
		System.out.println("phone number: "+StaticVariableDemo.PhoneNum);
		

	}
}
