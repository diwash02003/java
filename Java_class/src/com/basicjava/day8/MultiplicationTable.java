package com.basicjava.day8;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Multiplication of : ");
		int value =scanner.nextInt();
		int count =1;
		
		do {
			
			
			int multiplyValue=value*count;
			System.out.println(+value +" * " +count +" = "+multiplyValue);
			
			count ++;
		}while(count<=10);
		
		scanner.close();
		
	}

}
