package com.simplilearn.collections.list;

public class StudentList {
	
	// WAP for student object list and iterating the object list.
	private int rollId;
	private String name;
	private int marks;
	public StudentList(int rollId, String name, int marks) {
		super();
		this.rollId = rollId;
		this.name = name;
		this.marks = marks;
	}
	public int getRollId() {
		return rollId;
	}
	public void setRollId(int rollId) {
		this.rollId = rollId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
