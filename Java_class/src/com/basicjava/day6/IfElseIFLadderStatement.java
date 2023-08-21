package com.basicjava.day6;

public class IfElseIFLadderStatement {
	public static void main(String[] args) {
		int data =230;
		if(data > 230)
		{
			System.out.println("Inside if block...");
			System.out.println(data+ " is greater.");
			
		}
		else if(data>228) 
		{
			System.out.println("Inside first else if block...");
			System.out.println(data+ " is greater than 228.");
		}
		else if(data > 229)
		{
			System.out.println("Inside second else if block...");
			System.out.println(data+ " is greater than 229.");
		}
		else
		{
			System.out.println("Inside else block...");
			System.out.println("All the above condition are failed.");
		}
	}

}
