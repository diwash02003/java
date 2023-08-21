package com.basicjava.day7;

import java.util.Scanner;

public class DayofWeek {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		
		
		
		System.out.println("Enter a number: ");
		int choice = scanner.nextInt();
		
		
		switch(choice)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Twesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
	
		 
		default:
			System.out.println("Enter valid choice");
		
		 
	  }
		scanner.close();
	}

}
