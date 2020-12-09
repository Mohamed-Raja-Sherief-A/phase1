package com.simplilearn.bank;

import java.util.Scanner;

public class BankOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		
		a.welcome();
		a.showBalance();
		System.out.println("Enter amount :");
		Scanner s=new Scanner(System.in);
		double amount=s.nextDouble();
		a.deposit(amount);
		a.withdraw(amount);

	}

}
