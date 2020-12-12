package com.simplilearn.exception.school;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentMethods {
	
	public void displayStudents(List<Student> Students) throws NullPointerException
	{
		if(Students!=null)
		{
			for(Student s:Students)
			{
			System.out.println("-----------------------------");
			System.out.println("Roll no:"+s.getId());
			System.out.println("Name:"+s.getName());
			System.out.println("Marks:"+s.getMarks());
			System.out.println("Result:"+s.getResult());
			System.out.println("-----------------------------");
			}
		}
		else
		{
			throw new NullPointerException("No Students Available");
		}
	}
	public void addStudent(List<Student> Students,Student s) throws StudentException, ResultException, MarksException
	{
		
		if(s.getId()!=0&&s.getMarks()!=0&&!s.getName().equals(null)&&!s.getResult().equals(null))
		{
		
			try
			{
			Float Marks=new Float(s.getMarks());
			Integer Roll = new Integer(s.getId());
				if(s.getMarks()>0 && s.getMarks()<100)
				{
					if(s.getResult().equals("fail")||s.getResult().equals("pass"))
					{
						Students.add(s);
						System.out.println("added");
					}
					else
					{
						throw new MarksException("Enter valid pass or fail");
					}
				}
				else
				{
					throw new StudentException("Enter Valid Marks between 0 - 100");
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter Valid Numerical Value");
			} 
			
		}
		else
		{
		
			throw new StudentException("Enter All Values");
		}
	}

}
