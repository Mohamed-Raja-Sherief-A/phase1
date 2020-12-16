package com.simplilearn.datastructure.linkedList.circularlinkedList;

public class EmployeeCircularLinkedList {
private EmployeeNode head;
private EmployeeNode tail;
private int size;
	public boolean isEmpty()
	{
		return head==null;
		
	}
	public int getSize()
	{
		return size;
	}
	public void addToFront(Employee employee)
	{
		if(isEmpty())
		{
		EmployeeNode node=new EmployeeNode(employee);
		node.setNext(head);
		head=node;
		tail=node;
		size++;
		}
		else
		{
			EmployeeNode node =new EmployeeNode(employee);
			node.setNext(head);
			head=node;
			tail.setNext(head);
			size++;
		}
		
	}
	public void removeFromFront()
	{
		if(isEmpty())
		{
			System.out.println("no element");
		}
		else
		{
			EmployeeNode removenode=head;
			head=head.getNext();
			removenode.setNext(null);
			tail.setNext(head);
			size--;
		}
	}
	
	public void displayItems()
	{
		EmployeeNode current=head;
		int i=0;
		System.out.println(
				);
		System.out.print("Head-");
		while(current!=null)
		{
			System.out.print(current.getData());
			System.out.print("->");
			current=current.getNext();
			i++;
			if(i>5)
			{
				break;
			}
		}
		System.out.print("null");
	}
}
