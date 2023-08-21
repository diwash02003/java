package com.basicjava.day5;

import java.util.Scanner;

public class SimpleIfStatement {

	public static void main(String[] args) {
		
     	Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter any number: ");
//		int num1= scanner.nextInt();
//		
//	if(num1%2==0){
//		System.out.println(" You enter even number, and the number is "+num1);
//		}
//	
	
	String ExpectedName ="Ram";
	
	System.out.println("Enter your name: ");
	String name =scanner.nextLine();
	boolean result =name==ExpectedName;
	if(result ==true){
		
		System.out.println("Equal");
		
scanner.close();
	}
	}
}
	
