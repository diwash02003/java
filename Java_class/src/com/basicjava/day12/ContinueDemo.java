package com.basicjava.day12;

import java.util.Scanner;

public class ContinueDemo {
	
	
	public static void main(String[] args) {
		
//		for(int i=0;i<10;i++) {
//			if(i==5|| i==7 || i==8) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
		
		int sum=0,num,n;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter value of n: ");
	    n =scanner.nextInt();
		System.out.println("Enter number: ");
		
		
//		int i=0;
//		do {
//			
//			num=scanner.nextInt();+
//			if(num<0) {
//				continue;
//			}
//			else {
//				sum=sum+num;
//			}
//			i++;
//		}while(i<n);
//		System.out.println("The sum is "+sum+"\nNote:sum is taken of only positive number");
		
//		
		for(int i=0;i<n;i++) {
			
			num =scanner.nextInt();
			if(num<0){
				continue;
			}
			else if(num%2==0) {
				sum=sum +num;
			}	
		}
		System.out.println("The sum is:"+sum);
		System.out.println("Note: sum is taken only if even number.");
		
		scanner.close();
	}

}
