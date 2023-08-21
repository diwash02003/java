package com.basicjava.day5;

public class NotOperator {
	public static void main(String[] args) {
		
		int a=5;
		int b=6;
		boolean result1 =!(a==b);
		boolean result2 =(a!=b);
		boolean result3= (a>=b)||!(a>b)&&(b!=a);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);


		
		
	}

}
