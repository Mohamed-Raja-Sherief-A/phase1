package com.simplilearn.constructor;

public class StudentDemo {

	public static void main(String[] args) {
		// Wap a program to create student constructor to initialize 
		// object with or without parameters.
		Student st=new Student();
		st.showStudent();
		Student st1=new Student(1, "Raja", 90);
		st1.showStudent();
		
	}

}
