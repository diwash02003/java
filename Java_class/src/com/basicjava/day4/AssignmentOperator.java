package com.basicjava.day4;

public class AssignmentOperator {
	public static void main(String[] args) {
		
		//simple assignment operator;
		int num1= 20;
		int num2 =30;
		int result = num1+ num2;
		
		System.out.println("Result: "+result);
		
		//Add AND assignment operator(+=);
		num2 +=num1; //num2=num2+num1  num2=30+20=50;
		System.out.println("Num2: "+num2);
		
		//Subtract AND assignment operator(-=);
		num2-=num1; //num2=num2-num1 num2=50-20=30;
		System.out.println("Num2: "+num2);

		
		//Multiply AND assignment operator(*=);
		num2*=num1;//num2=num2*num1 num2=30*20=600;
		System.out.println("Num2: "+num2);


		//Divide AND assignment operator(/=);
		num1/=num2; //num1=num1/num2 num1=20/600=30;
		System.out.println("Num2: "+num1);


		//Modulus AND assignment operator(%=).
		num1%=num2; //num1=num1%num2  num1=0%30=0;
		System.out.println("Num2: "+num1);

		


	}

}
