package com.basicjava.day3;

public class StaticVariableDemo {
	
	private static String collegeName;
	private static int rollNum;
	private static double amount;
	private static boolean gender;
	public static String PhoneNum;
    static int age;
    
    
    //method setdata() is not in use on this class ,but it is being called in another class......
    public static void setdata() {
		PhoneNum = "something";
		age = 21;
    }
    
    //calling static method in main method and displaying data for static method..
    //making static void StaticData() for displaying output and it is being called in main method.....
    
    public static void StaticData() {
    	
    	System.out.println(collegeName);
    	System.out.println(rollNum);
    	System.out.println(amount);
    	System.out.println(gender);
    	System.out.println(PhoneNum);
    	System.out.println(age);
    	
    
    }
    
	public static void main(String[] args) {
		collegeName = "diwash";
		rollNum = 23;
		amount = 3456.655;
		gender = true;
		PhoneNum = "something";
		age = 21;
		
		StaticVariableDemo.StaticData();
	}
}
