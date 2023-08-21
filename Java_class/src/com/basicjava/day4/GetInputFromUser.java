package com.basicjava.day4;

import java.util.Scanner;

public class GetInputFromUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = scanner.nextInt();
		//scanner.nextLine();
		
		System.out.print("First Name: ");
		scanner.nextLine();
		String firstName =scanner.nextLine();
		
		//System.out.print("Middle Name: ");
		
		
		System.out.print("Last Name: ");
		String LastName =scanner.nextLine();
		
		System.out.print("Roll Num: ");
		int Rollnum = scanner.nextInt();
		//scanner.nextLine();
		
		System.out.print("Age: ");
		int Age = scanner.nextInt();
		//scanner.nextLine();
		
		System.out.print("Address: ");
		scanner.nextLine();
		String Address = scanner.nextLine();
		
		System.out.print("Gender ");
		char Gender = scanner.nextLine().charAt(0);
		
		
		System.out.println("Entered number is: "+num1);
		
		System.out.println("Your First Name is: "+firstName);
		System.out.println("Your Last Name is: "+LastName);
		System.out.println("Your Roll Number is: "+Rollnum);
		System.out.println("Your Age is: "+Age);
		System.out.println("Your Address is: "+Address);
		System.out.println("Your Gender is: "+Gender);

		scanner.close();

		
	}

}
