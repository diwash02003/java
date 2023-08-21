package com.basicjava.day7;

import java.util.Scanner;

public class ClassAssignment {

	public static void main(String[] args) {
		char character;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any character: ");
		character=scanner.nextLine().charAt(0);
		
//		character=scanner.nextLine();
//		char source =character.charAt(0);
//		char vo&c = source.toLowerCase.charAt(0);
//		
		
		//char character =chara.toLowerCase().charAt(0);
		//char vowelcon = character.toLowerrCase().charAt(0);
		
		
		if(character=='a'|| character=='A' || character=='e'|| character=='E'||character=='i'||character=='I'||character=='o'|| character=='O'||character=='u'|| character=='U')
		{
			System.out.println("The input character is vowel");
			
			
		}
		else {
			System.out.println("The character is consonent.");
		}
		
		if(character>='A' && character<='Z') {
			System.out.println("The input is:"+character +" in upper case.");
		}
		else {
			System.out.println("The input is: "+character +" in lower case.");
		}
		
//		int value= (int)character;
//		
//		if(value>=65 && value<=90)
//		{
//			System.out.println("The input is in upper case.");
//		}
//		else
//		{
//			System.out.println("The input is in lower case.");
//
//		}
	}
}
