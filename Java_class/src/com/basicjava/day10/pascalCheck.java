package com.basicjava.day10;

import java.util.Scanner;

public class pascalCheck {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desire pascal number to check:");
		int num = sc.nextInt();
		System.out.println("Enter the j index : ");
		int j = sc.nextInt();
		
		int res=isPascal(num,j);
		System.out.println(res);
		
		sc.close();
	}


	public static int isPascal(int num,int j) {
	
		int sum =0;
		
		for(int i=1;i<=j;i++)
		{
			 sum = sum +i;
			 if(sum==num)
			 {
				 return 1;
			 }
		}
		return 0;


}

}