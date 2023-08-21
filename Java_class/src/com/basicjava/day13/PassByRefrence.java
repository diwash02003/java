package com.basicjava.day13;

import java.util.Arrays;

public class PassByRefrence {
	 
	public void getData(String[] collegeName) {
		collegeName[0]="Texas College";
		collegeName[1] = "CCRC";
	}

	public static void main(String[] args) {
		
		String[] collegeName= {"ABC","XYZ","KU"};
		System.out.println("Before: "+Arrays.toString(collegeName));
		
		PassByRefrence obj = new PassByRefrence();
		obj.getData(collegeName);
		System.out.println("After: "+Arrays.toString(collegeName));

		
	}
	
}
