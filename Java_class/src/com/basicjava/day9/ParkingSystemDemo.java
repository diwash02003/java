package com.basicjava.day9;

import java.util.Scanner;

public class ParkingSystemDemo {
	
	public static int flag =1;
	public static int choice;
	static int bikeSpace=10,carSpace =10,bookedCar =0,bookedBike=0;
	static int bikeToken =0, carToken =0;

	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		while(flag==1) {
			display(scanner);
			System.out.print("Enter your choice:");
			  choice = scanner.nextInt();
			switch(choice){
			
			case 1:
				parkIn(scanner);
				break;
			case 2:
				parkOut(scanner);
				break;
			case 3:
				displayParkingSlot(scanner);
				break;
			case 4:
				flag =0;
				break;
				
			default:
				System.out.println("Enter valid choice........");
			
				}
			}
			
			
		
		scanner.close();
	}

	public static void displayParkingSlot(Scanner scanner) {
		
		System.out.println("\nAvailable space....");
		System.out.println("For bike: "+bikeSpace);
		System.out.println("For car: "+carSpace);
		
		System.out.println("Booked place (car): "+bookedCar);
		System.out.println("Booked place (bike): "+bookedBike);
		

	}

	public static void parkOut(Scanner scanner) {
		

		System.out.println("Which vehicle you want to take out \n1.Bike\n2.Car\n");
		choice =scanner.nextInt();
		if(choice==1) {
			
			System.out.print("enter your token: ");
			int token = scanner.nextInt();
			
			if (bikeToken==token){
				System.out.println("Bike out successfully..");
				bookedBike = bookedBike -1;
				bikeSpace=bikeSpace +1;
			}
			else {
				System.out.println("Invalid token.....");
			}
			
		}
		else if(choice ==2) {
			System.out.print("enter your token: ");
			int token = scanner.nextInt();
			if(carToken==token){
				System.out.println("car out successfully..");
				bookedCar = bookedCar -1;
				carSpace=carSpace +1;
			}
			else {
				System.out.println("Invali token.....");
			}
		}
		
		
		
	}

	public static void parkIn(Scanner scanner) {
	
		System.out.println("Which vehicle you want to park\n1.Bike\n2.car\n");
		choice =scanner.nextInt();
		
		if(choice==1) {
			if(bookedBike!=10){
				System.out.println("bike park successfully..");
				bookedBike =bookedBike+ 1;
				bikeSpace=bikeSpace -1;
				
				bikeToken =bikeToken +1;
				System.out.println("your token is "+bikeToken);
			}
			else {
				System.out.println("No space for parking...");
			}
		}
		else if(choice ==2) {
			if(bookedCar!=10){
				System.out.println("car park successfully..");
				bookedCar =bookedCar+ 1;
				carSpace=carSpace -1;
				
				carToken =carToken+1;
				System.out.println("your token is "+carToken);
			}
			else {
				System.out.println("No space for parking...");
			}
		}
		
	}

	public static void display(Scanner scanner) {
		
		System.out.println("MENU:");
		System.out.println("press 1 for Park In");
		System.out.println("press 2 for Park Out");
		System.out.println("press 3 for Available Space in Parking slot");
		System.out.println("press 4 for Exit");
		
	}

}
