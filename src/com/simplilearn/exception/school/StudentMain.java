package com.simplilearn.exception.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter Roll No:");
		st.setId(Integer.parseInt(s.nextLine()));
		System.out.println("Enter Name:");
		st.setName(s.nextLine());
		try {
		System.out.println("Enter Marks:");
		st.setMarks(Float.parseFloat(s.nextLine()));
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter valid number between 0 to 100");
		}
		
		System.out.println("Enter Result:");
		st.setResult(s.nextLine());
		System.out.println(st);
		List<Student> Students =new ArrayList<Student>();
	
		StudentMethods sm=new StudentMethods();
		try
		{
			
		sm.addStudent(Students, st);
		}
		catch(StudentException e)
		{
			
			System.out.println(e);
		}
		catch(ResultException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(MarksException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Program Ended");
		}
		
		

	}

}
