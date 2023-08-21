package com.basicjava.day12;

import java.util.Scanner;

public class SumClassWork {

	public static void main(String[] args) {
		int n, num = 0 ,sum = 0;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter value of n: ");
	    n =scanner.nextInt();
		System.out.println("Enter number: ");
//		
//		for(int i=0;i<n;i++) {
//			num=scanner.nextInt();
//			if(num<0) {
//				break;
//			}
//				else {
//					sum=sum+num;
//				}
//			}
//			System.out.println("The sum is "+sum);
//			
		
			int i = 0;
			while(i<n) {
				num=scanner.nextInt();
				if(num<0) {
					break;
				}
				else {
					sum=sum+num;
				}
				i++;
			}
			System.out.println("The sum is "+sum);
			
//			
//			int i=0;
//			do {
//				num=scanner.nextInt();
//				if(num<0) {
//					break;
//				}
//				else {
//					sum=sum+num;
//				}
//				i++;
//			}while(i<n);
//			System.out.println("The sum is "+sum);
			
		scanner.close();
		}		
	}
	
