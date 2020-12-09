package com.simplilearn.typecasting;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		// TODO :: WAP for taking a user Input as string and convert it into int,Byte,float,double and long.
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a numerical value:");
		String in=input.nextLine();
		int intValue=Integer.parseInt(in);
		byte byteValue=Byte.parseByte(in);
		float flaotValue=Float.parseFloat(in);
		double doubleValue=Double.parseDouble(in);
		long longValue=Long.parseLong(in);
		System.out.println();
		System.out.println("Output Value");
		System.out.println();
		System.out.println("Integer Value:"+intValue);
		System.out.println("Float Value:"+flaotValue);
		System.out.println("Double Value:"+doubleValue);
		System.out.println("Long Value:"+longValue);
		System.out.println("Byte Value:"+byteValue);
		
	
	}
}
