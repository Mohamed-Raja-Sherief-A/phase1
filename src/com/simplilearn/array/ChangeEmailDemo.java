package com.simplilearn.array;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeEmailDemo {

	public static void main(String[] args) {
		// TODO WAP for taking user email verify with existing data if available change with new value.
		// otherwise throw error.
		String[] emails= {"raja@abc.com","sherief@abc.com","mohamed@abc.com"};
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("List of email id:");
		System.out.println(Arrays.toString(emails));
		System.out.println();
		System.out.println();
		System.out.println("Enter the email id to replace:");
		String oldEmail=s.nextLine();
		System.out.println("Enter new Email ID:");
		String newEmail=s.nextLine();
		for(int i=0;i<emails.length;i++)
		{
			if(emails[i].equals(oldEmail))
			{
				emails[i]=newEmail;
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Email id not found");
		}
		if(flag==1)
		{
			System.out.println(Arrays.toString(emails));
		}
		

	}

}
