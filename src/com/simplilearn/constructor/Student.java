package com.simplilearn.constructor;
//homework 8/12/20
public class Student {
	
	// no,name,marks
	private int rollNo;
	private String name;
	private int marks;
	public Student(){
		
	}
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public void showStudent() {
		System.out.println("rollno:"+this.rollNo+" name:"+this.name+" marks:"+this.marks);
	}
	
	// showStudent
	
	// WAP a parameterized constructor 

}
