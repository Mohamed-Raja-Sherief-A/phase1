package com.simplilearn.mystatic;

public class Employee {
	// WAP for static and non static variable and methods
	
	private int id=1;
	private static String company="ABC";
	
	public static void showCompanyName()
	{
		System.out.println("comapny name:"+company);
	}
	public void showRoll()
	{
		System.out.println("ID:"+id);
	}
	
	
}
