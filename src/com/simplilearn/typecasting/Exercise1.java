package com.simplilearn.typecasting;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO  : WAP for converting user input (int)  into float, double, long, and byte
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the input integer:");
		int inputCount=input.nextInt(); //Input Taken int
		float floatCount=inputCount;
		double doubleCount=inputCount;
		long longCount=inputCount;
		byte byteCount=(byte) inputCount;
		//Output
		System.out.println();
		System.out.println("Output After Convertion");
		System.out.println();
		System.out.println("Integer Value:"+inputCount);
		System.out.println("Float Value:"+floatCount);
		System.out.println("Double Value:"+doubleCount);
		System.out.println("Long Value:"+longCount);
		System.out.println("Byte Value:"+byteCount);
	}

}
