package com.simplilearn.exception.school;

public class Student {
	// id , name , rollno , marks, result
	private int id;
	private String name;
	private float marks;
	private String result;
	public Student(int id, String name, float marks, String result) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.result = result;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", result=" + result + "]";
	}
	
	// showMarks 
	// addMarks ->
	// changeResult ->
}
