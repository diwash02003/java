package com.basicjava.day9;

import java.util.Scanner;

public class ReverseInputNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter number for reverse:");
		int num1=scanner.nextInt();
		
		
		int reverse =0;
		
		while(num1!=0) {
			int remainder = num1 % 10;  
			reverse = reverse * 10 + remainder;  
			num1 = num1/10; 
		}
		System.out.println("Reverse is " +reverse);
		
		scanner.close();
	}

}
