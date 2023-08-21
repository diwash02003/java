package com.basicjava.day5;

public class RelationalOperator {
	static int num1=5;
	static int num2=9;
	
	 public static  void  isEqual() {
		 boolean result =(num1==num2);
		System.out.println("Result for isEqual: "+result);
	}
	 
	 public static  void  notEqual() {
		 boolean result1 =(num1!=num2);
		System.out.println("Result for notEqual: "+result1);
	}
	 
	 public static  void  greaterThan() {
		 boolean result2 =(num1>num2);
		System.out.println("Result for isEqual:"+result2);
	}
	 
	 public static  void  lessThan() {
		 boolean result3 =(num1<num2);
		System.out.println("Result for isEqual: "+result3);
	}
	 
	 public static  void  GreaterThanOrEqualTO() {
		 boolean result4 =(num1>=num2);
		System.out.println("Result for GreaterThanorEqualTO: "+result4);
	}
	 public   void  LessThanOrEqualTO() {
		 boolean result5 =(num1<=num2);
		System.out.println("Result for LessThanorEqualTO: "+result5);
	}
	 
	 
	 
	
 public static void main(String[] args) {
	 
	 // for static 
	 isEqual();
	 notEqual();
	 greaterThan();
	 lessThan();
	 GreaterThanOrEqualTO();
	 
	 // for non static
	 RelationalOperator demo = new RelationalOperator();
	 demo.LessThanOrEqualTO();
	 
	 
	}	
}
