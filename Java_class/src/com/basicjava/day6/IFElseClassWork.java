package com.basicjava.day6;

public class IFElseClassWork {
	
	public static void main(String[] args) {
		
		//float marks[]= {100,80,76,56,89};
		//float per=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
		
		int per =50;
		
		if(per>=50 && per<60) {
			System.out.println("Second Devision "+per+" %");
			return;
			}
		if(per>=60 && per <80) {		
			System.out.println("Third Devision "+per+" %");
			return;
			}
		if(per>80) {
			System.out.println("Distinction  "+per+" %");
			return;
	
			}
		if(per>=40 && per <50) {
			System.out.println("Third Devision "+per+" %");
			return;
			}
		else {
			System.out.println("Fail "+per+" %");
			}
	}

}
