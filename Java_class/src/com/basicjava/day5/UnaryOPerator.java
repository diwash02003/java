package com.basicjava.day5;


import java.util.Scanner;

public class UnaryOPerator {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		 num =scanner.nextInt();
		
		num++;
		System.out.println(num);
		
		num =7;
		num--;
		System.out.println(num);
		
		num=10;
		++num;
		System.out.println(num);
		
		num =57;
		--num;
		System.out.println(num);
		
		
		scanner.close();
		
		}
	
	
	
}
	
