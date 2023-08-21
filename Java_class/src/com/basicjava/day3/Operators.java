package com.basicjava.day3;

public class Operators {
	public static int Add(int a,int b) {
		int addition=a+b;
		return addition;
	}

	public static int subtract(int a,int b) {
		int sub=a-b;
		return sub;
		
	}
	public static int multiply(int a,int b) {
		int mul=a*b;
		return mul;
	}
	public static double divide(double a,double b) {
		double div=a/b;
		return div;
	}
	public static int modulus(int a,int b) {
		int mod=a%b;
		return mod;
	}
	public static void main(String[] args) {
		
		int num1=45;
		int num2=40;
		
		System.out.println("Different operation of two number "+num1+ " and " +num2 +" is: ");

		System.out.println("Addition is: "+Operators.Add(num1, num2));
		System.out.println("Subtraction is: "+Operators.subtract(num1, num2));
		System.out.println("Multyiply is: "+Operators.multiply(num1, num2));
		System.out.println("Division is: "+Operators.divide(num1, num2));
		System.out.println("Remainder is: "+Operators.modulus(num1, num2));
		
		//Operators obj =new Operators();
		//obj.Add(num1,num2);
		//obj.subtract(num1,num2);
		//obj.multiply(num1,num2);
		//obj.modulus(num1,num2);
		
		
	}
}
