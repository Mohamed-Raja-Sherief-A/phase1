package com.simplilearn.datastructure.linkedList.circularlinkedList;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Tim=new Employee(1,"Tim");
		Employee Raja=new Employee(2,"Raja");
		Employee Sherief=new Employee(3,"Sherief");
		EmployeeCircularLinkedList ec=new EmployeeCircularLinkedList();
		ec.addToFront(Raja);
		ec.addToFront(Tim);
		ec.addToFront(Sherief);
		ec.displayItems();
		ec.removeFromFront();
		ec.displayItems();
		

	}

}
