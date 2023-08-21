package com.basicjava.day11;

public class CollectionOfStudent {

	public static void main(String[] args) {
		
		StudnetData[] studentsDataObj = new StudnetData[2];
		
		
		
			StudnetData std1 =new StudnetData();
			std1.setName("Diwash");
			std1.setAddress("ktm");
			std1.setRollNo(1);
			studentsDataObj[0]=std1;
			
			
			StudnetData std2 =new StudnetData();
			std2.setName("sumit");
			std2.setAddress("sundarijal");
			std2.setRollNo(2);
			studentsDataObj[1]=std2;
		
		
		//for each;;;
		for(StudnetData student : studentsDataObj) {
			
		System.out.println("Name :"+student.getName());
		System.out.println("Address :"+student.getAddress());
		System.out.println("RollNo :"+student.getRollNo());
		System.out.println();
		}
	}
	
}
