package com.basicjava.day12;

import java.util.Scanner;

public class ReturnDemo {

	private  String name;
	private  String address;
	private  String phone;
	private  String email;
	
	public  String   dispalyCOllegeDetatils() {
		String result = "\nName: "+name+ "\naddress: "+address+"\nphone:"+phone+"\nemail: "+email;
		return result;
	}
	
	public  void  SetCOllegeDetatils(  ) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter college name, address, phoneNum, emial:");
		
		 name=scanner.nextLine();
		 address=scanner.nextLine();
		 phone=scanner.nextLine();
		 email= scanner.nextLine();
		 
		 scanner.close();
	}
	
	public static void main(String[] args) {
		
		ReturnDemo returnDemo=new ReturnDemo();
		
		returnDemo.SetCOllegeDetatils();
		String ret = returnDemo.dispalyCOllegeDetatils();
		
		System.out.println(ret);
		
	}	
}
