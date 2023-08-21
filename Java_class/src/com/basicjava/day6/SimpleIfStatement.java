package com.basicjava.day6;

import java.util.Scanner;

public class SimpleIfStatement {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
	
		System.out.println("Enter first Number: ");
		int num1 =scanner.nextInt();
		
		System.out.println("Enter second Number: ");
		int num2 =scanner.nextInt();
		
		System.out.println("Enter third Number: ");
		int num3 =scanner.nextInt();
		
		if(num1>num2 && num1>num3)
		{
				System.out.println("Number "+num1 +" is greater than "+num2 +" and "+num3+".");
		}
		if(num2>num1 && num2>num3) {
			System.out.println("Number "+num2 +" is greater than "+num1 +" and "+num3+".");

		}
		if (num3>num1 && num3>num2) {
		System.out.println("Number "+num3 +" is greater than "+num1 +" and "+num2 +".");
		}
		scanner.close();
	}

}
