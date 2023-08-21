package com.basicjava.day7;

import java.util.Scanner;

public class ClassAssignment2 {
	
	//write a java to simulate the ATM machine and perform below cases:
	//....user should allows to deposit,withdraw.
	//....if balance == 0,display the massage as not sufficient balance.
	//....if balance >500 , allows to withdraw.
	//....Display the remaining balance after performing above transition.
	static double balance=1000;
	static int  option;
	
	
	public static void displayMenu(Scanner scanner){
		System.out.println("1.Withdraw \n2.Deposit \n3.Balance check \n4.Exit");
		System.out.print("\nEnter your option: ");
			
	}
	
	private static void depositAMount(Scanner scanner) {
		System.out.print("\nEnter amount for deposit: ");
		double deposit =scanner.nextDouble();
		balance = balance + deposit;
		System.out.println("Your balance: "+balance);
	}
	
	private static void withdrawAmount(Scanner scanner) {
		System.out.print("\nEnter amount for withdraw: ");
		double withdraw = scanner.nextDouble();
		if(balance>500 ) {
			if(withdraw>500) {
				balance =balance -withdraw;
				System.out.println("Withdraw amount: "+withdraw);
				System.out.println("Remaining balance: "+balance);
			}
			else {
				System.out.println("Withdraw balanc shoudle be more than 500...");
			}
		}
		else{
			System.out.println("\nNot suficient Balance....");	
		}
		
		System.out.println("\nThank you visit again !!!!");	
	}
	
	private static void checkbalance() {
		System.out.println("Balance: "+balance);
	}
	
	public static void main(String[] args) {
		//System.out.println(balance);
		displayMenu(null);
		Scanner scanner =new Scanner(System.in);
		option=scanner.nextInt();
	
		if(option ==1){
			withdrawAmount(scanner);
		}
		else if(option ==2){
			depositAMount(scanner);	
		}
		else if(option ==3){
			checkbalance();	
		}
		else if(option ==4)
		{
			return;
		}
		else{
			System.out.println("Enter valid option. ");
		}
	
	}
}
