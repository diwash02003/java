package com.basicjava.day8;

import java.util.Scanner;

public class ParkingAssignment {
	
	static int bikeTotalCapacity =100;
	static int carTotalCapacity=100;
	static int availableSpaceCar;
	static int availableSpaceBike;

	
	public static void dispalyInParkingMenu(Scanner scanner) {
		System.out.println("1. car parking\n2.Bike parking");
		System.out.print("Enter your parking choice: ");
		int choice =scanner.nextInt();
		
		if(choice ==1) {
			if(availableSpaceCar<carTotalCapacity) {
				availableSpaceCar =availableSpaceCar +1;
				carTotalCapacity =carTotalCapacity -1 ;
				System.out.println("Park successfuly!");
				System.out.println("Booked: "+availableSpaceCar);
				System.out.println("Remaining car capacity: "+carTotalCapacity);
			}
			
		}
		else if(choice ==2) {
			if(availableSpaceBike<bikeTotalCapacity) {
				availableSpaceBike =availableSpaceBike +1;
				bikeTotalCapacity =bikeTotalCapacity -1;
				System.out.println("Park successfuly!");
				System.out.println("Booked: "+availableSpaceBike);
				System.out.println("Remaining bike capacity"+bikeTotalCapacity);
			}
		}
		else {
			System.out.println("Invalid choice....");
		}
	}
	
	public static void displayMenu(Scanner scanner) {
		System.out.println("Menu:\n1.In parking\n2.Out Parking\n3.show parking\n4.Exit\n");
		
		System.out.println("Enter your choice");
		int choice =scanner.nextInt();
		
		switch(choice) {
		
		case 1:
			
			dispalyInParkingMenu(scanner);
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4: 
			break;
		default:
				
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		displayMenu(scanner);
		
		scanner.close();
	}

}
