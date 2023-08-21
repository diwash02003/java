package com.basicjava.day9;

import java.util.Scanner;

public class GameUsingDoWhile {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int num;
		
		int x=3;
		do {
		System.out.println("Enter any number: ");
		 num=scanner.nextInt();
		 x--;
		 if(num==5) {
			 System.out.println("congratulatioin!!!!");
			 return;
		 }
		 else {
			 System.out.println("Pls try again\n");
			 System.out.println("you have "+x+" times remaining");
		 }
		
		if(x==0 && num !=5) {
			System.out.println("*****sorry the lucky number is 5*****");
		}
		}while(x!=0);

		scanner.close();
	}
	
}
