package com.basicjava.day5;

public class BitWiseOperator {
	public static void main(String[] args) {
		
		int num1=7;
		int num2=6;
		int result =num1&num2;
		System.out.println("Result of bitwise and : "+result);
		
		int result2 =num1 | num2;
		System.out.println("result of bitwise or: "+result2);
		
		int result3 =num1 ^ num2;
		System.out.println("result of bitwise exclusive or: "+result3);
		
		int result4 =~num2;
		System.out.println("result of bitwise not: "+result4 );
		
	}

}
