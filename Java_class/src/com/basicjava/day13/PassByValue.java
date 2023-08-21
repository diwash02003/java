package com.basicjava.day13;

public class PassByValue {
	
	public void getData(int num1 ,int num2) {
		num1=num1+5;
		num2=num2+20;
	}
	
	public static void main(String[] args) {
		
		int num1=20;
		int num2=50;
		
		System.out.println("Before Num1: "+num1);
		System.out.println("Before Num2: "+num2);
		PassByValue Demo= new PassByValue();
		Demo.getData(num1, num2);
		
		System.out.println("After Num1: "+num1);
		System.out.println("After Num2: "+num2);	
		
	}

}
