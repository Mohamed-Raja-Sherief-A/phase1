package com.simplilearn.datastructure.linkedList.circularlinkedList;

public class EmployeeNode {
private Employee data;
private EmployeeNode next;
public EmployeeNode(Employee data) {
	super();
	this.data = data;
	
}
public Employee getData() {
	return data;
}
public void setData(Employee data) {
	this.data = data;
}
public EmployeeNode getNext() {
	return next;
}
public void setNext(EmployeeNode next) {
	this.next = next;
}
@Override
public String toString() {
	return "EmployeeNode [data=" + data + ", next=" + next + "]";
}

}
