package com.simplilearn.bank;

public class Account {
private double balance=4656;
private String name="Raja";

public void showBalance()
{
	System.out.println("The name:"+name+" The balance is:"+balance);

}
public void welcome()
{
	System.out.println("-----------------------");
	System.out.println("Welcome to bank");
	System.out.println("-----------------------");
}

public void withdraw(double amount) //home work class 2 8/12/20
{
	if(amount<this.balance)
	{
	double newAmount=this.balance-amount;
	this.balance=newAmount;
	System.out.println("The new balance is :"+this.balance);
	}
}
public void deposit(double amount) //home work class 2 8/12/20
{
	
	double newAmount=this.balance+amount;
	this.balance=newAmount;
	System.out.println("The new balance is :"+this.balance);
	
}
}
