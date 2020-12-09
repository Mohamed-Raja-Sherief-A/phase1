package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		List<StudentList> students=new ArrayList<>();
		StudentList st1=new StudentList(1, "Raja", 80);
		StudentList st2=new StudentList(2, "Mohamed", 90);
		StudentList st3=new StudentList(3, "Sherief", 100);
		students.add(st1);
		students.add(st2);
		students.add(st3);
		for(StudentList st:students)
		{
			System.out.println(" Roll ID:"+st.getRollId()+" Name:"+st.getName()+" Marks:"+st.getMarks());
		}
		
	}

}
