package com.basicjava.day3;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		
		//widening type casting....
		int num1= 34;
		double intToDouble = num1;
		
		System.out.println("Original number: "+num1);
		System.out.println("After performing WTC: "+intToDouble);

		
		//Narrowing type casting...
		double num2= 545.555;
		int doubleToInt =(int)num2;
		
		System.out.println("\nOriginal number: "+num2);
		System.out.println("After performing NTC: "+doubleToInt);
		
		//string conversion.......
		//string to int .......
		String data = "300";
		int stingToInt = Integer.valueOf(data);
		
		System.out.println("\nOriginal data: "+data);
		System.out.println("After performing NTC: "+stingToInt);
		
		//double to string.....
		double salary = 45465.66;
		String doubleToString= String.valueOf(salary);
		
		System.out.println("\nOriginal data: "+salary);
		System.out.println("After performing NTC: "+doubleToString);
		
		
		Double income = 4567.665;
		double DoubleTodouble= income.doubleValue();	
		
		System.out.println("\nAfter performing NTC: "+DoubleTodouble);

		String incomeData = "45456.5";
		double dataResult = Double.parseDouble(incomeData);
		
		System.out.println("\nAfter performing NTC: "+dataResult);
		


	}
	
}