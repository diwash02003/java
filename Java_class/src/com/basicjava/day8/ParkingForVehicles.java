package com.basicjava.day8;

import java.util.Scanner;

public class ParkingForVehicles {
	
	static int choice;
	static int bikeSpace=3,carSpace =3,bookedCar =0,bookedBike=0;
	//static String car, bike;
	static int flag =1;
	
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Menu:\n1.park\n2.out\n3.show\n4.exit\n");
		while(flag==1) {
		System.out.print("Enter your choice:");
		choice = scanner.nextInt();
		switch(choice){
		
		case 1:
			park(scanner);
			break;
		case 2:
			out(scanner);
			break;
		case 3:
			show();
			break;
		case 4:
			flag =0;
			break;
			
		default:
			System.out.println("Enter valid choice........");
		
		}
		}
	}
	
	public static void show() {
		
		System.out.println("\nAvailable space....");
		System.out.println("For bike: "+bikeSpace);
		System.out.println("For car: "+carSpace);
		
		System.out.println("Booked place (car): "+bookedCar);
		System.out.println("Booked place (bike): "+bookedBike);

		
	}


	public static void out(Scanner scanner) {
		
		
		System.out.println("Which vehicle you want to take out \n1.Bike\n2.Car\n");
		choice =scanner.nextInt();
		if(choice==1) {
			
			if (bookedBike!=0){
				System.out.println("Bike out successfully..");
				bookedBike = bookedBike -1;
				bikeSpace=bikeSpace +1;
			}
			else {
				System.out.println("Sorry you should park first to take out.....");
			}
		}
		else if(choice ==2) {
			if(bookedCar!=0){
				System.out.println("car out successfully..");
				bookedCar = bookedCar -1;
				carSpace=carSpace +1;
			}
			else {
				System.out.println("Sorry you should park first to take out.....");
			}
		}
		
	}


	public static void park(Scanner scanner) {
		System.out.println("Which vehicle you want to park\n1.Bike\n2.car\n");
		choice =scanner.nextInt();
		if(choice==1) {
			if(bookedBike!=3){
				System.out.println("bike park successfully..");
				bookedBike =bookedBike+ 1;
				bikeSpace=bikeSpace -1;
			}
			else {
				System.out.println("No space for parking...");
			}
		}
		else if(choice ==2) {
			if(bookedCar!=3){
				System.out.println("car park successfully..");
				bookedCar =bookedCar+ 1;
				carSpace=carSpace -1;
			}
			else {
				System.out.println("No space for parking...");
			}
		}
		
		
	}
	
	
	
}
