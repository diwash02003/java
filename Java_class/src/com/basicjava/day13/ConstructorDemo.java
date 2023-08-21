package com.basicjava.day13;

public class ConstructorDemo {

	public  int id;
	public  String name;
	
	//non-parameterized constructor
	public void calling() {
		
		System.out.println("Inside non-parameterized");
		id = 1;
		name ="Diwash";
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		
	}
	
	public ConstructorDemo() {
		
		this.calling();
		
	}
	
	//parameterized constructor
	public ConstructorDemo(int age ,String name) {
		
		System.out.println("\nInside parameterized");
		System.out.println("Age: "+age+"\nName: "+name);
	
		
	}
	
	public static void main(String[] args) {
		
		new ConstructorDemo(); 
		new ConstructorDemo(30, "Ram");
		
		
	}
}
