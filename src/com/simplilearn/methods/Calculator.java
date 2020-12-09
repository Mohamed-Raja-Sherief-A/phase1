package com.simplilearn.methods;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter operand 1");
		int num1=input.nextInt();
		System.out.println("Enter operand 2");
		int num2=input.nextInt();
		Calculator cal=new Calculator();
		cal.Addition(num1, num2);
		cal.Substraction(num1, num2);
		
		
	}
	
	public void Addition(int num1,int num2)
	{
		int result=num1+num2;
		System.out.println("Addition result:"+result);
	}
	public void Substraction(int num1,int num2)
	{
		int result=num1-num2;
		System.out.println("Addition result:"+result);
	}
	//multiplaication
	//division

}
