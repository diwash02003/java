package com.basicjava.day13;

public class This1Demo {
	
	 private int num;
	 private String name;

	 public void value(int  num,String name){
		this.num =num;
		this.name=name;
		
	}
	 
	 public void showData() {
		 
		 this.value(1,"Ram");
		 
		 System.out.println("Name: "+name);
		 System.out.println("Num:" +num);
	 }

	public static void main(String[] args) {
		
		
		 This1Demo obj =new This1Demo();
		 obj.showData();
	}
}
