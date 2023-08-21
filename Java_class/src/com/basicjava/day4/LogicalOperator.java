package com.basicjava.day4;

public class LogicalOperator {
	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		boolean result1 = num2>20 && num1>10; //false && false =false
		
		boolean result2 = num1>20 && num2>10; //false && true =false
		
		boolean result3 = num1<=20 && num2>=10; //true && true = true;
		System.out.println("result3: "+result3);
		
		boolean result4 = num1 ==10 && num2 <=20; //true
		System.out.println("Result4: "+result4);
		
//		Scanner scanner =new Scanner(System.in);
//		System.out.print("Enter any number: "); 
//		
//		int num3 =scanner.nextInt();
//		
//		boolean result5= num3>0 && num2>10;
//		System.out.println("Result 5: "+result5);
		
		
		//logical or operator
		boolean result5 = num1>20 || num2>10; //false && true =true
		System.out.println("Result 5: "+result5);

		//scanner.close();
		
		boolean result7 = num1>20 || num2==10; 
		System.out.println("result7: "+result7);
		
		
	}
}
 