package com.basicjava.day11;

public class BreakDemo {
	
	public static void main(String[] args) {
		
		
		System.out.println("\nUsing and : output is:\n");
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++){
				if(i ==3 && j ==3) {
					break;
				}
				System.out.print(i+" , "+j+"  |  " );
				
			}
			System.out.println("\n------------------------------------------------");
			
		}
		
		System.out.println("\nUsing or : output is :\n");
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++){
				if(i ==3 || j ==3) {
					break;
				}
				System.out.print(i+" , "+j+"  |  " );
				
			}
			System.out.println("\n----------------------------");
		}
	}
}
