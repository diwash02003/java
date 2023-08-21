package com.basicjava.day6;

import java.util.Scanner;

public class IfStatementUsingFunction {
	public static void Greater(int a,int b, int c) {
		if(a>b && a>c)
		{
				System.out.println("Number "+a +" is greater than "+b +" and "+c+".");
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		
		System.out.println("Enter first,second and three Number: ");
		int num1 =scanner.nextInt();
		
		//System.out.println("Enter second Number: ");
		int num2 =scanner.nextInt();
		
		//System.out.println("Enter third Number: ");
		int num3 =scanner.nextInt();
		
		Greater(num1, num2, num3);
		Greater(num2, num1, num3);
		Greater(num3, num1, num2);
		
		scanner.close();
	}	
}
