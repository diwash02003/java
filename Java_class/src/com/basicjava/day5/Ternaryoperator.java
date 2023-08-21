package com.basicjava.day5;

public class Ternaryoperator {
	
	public static void main(String[] args) {
		int num1=48999;
		int num2=39;
		
		//condition ? true statement : false statement
		
		String message = ((num1>num2)? +num1 +" is greater than "+num2: num2 +" is greater than "+num1);
		System.out.println(message);
	}

}
