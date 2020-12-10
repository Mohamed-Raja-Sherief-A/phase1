package com.simplilearn.collections.list;

import java.util.Stack;

public class VectorList {
public static void main(String[] args) {
	Stack<Integer> i=new Stack<Integer>();
	i.push(1);
	i.push(2);
	i.push(3);
	i.pop();
	for(Integer j:i)
	{
		System.out.println(j);
	}
}
}
