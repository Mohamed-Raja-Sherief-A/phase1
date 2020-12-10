package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestArrayDeque {

	public static void main(String[] args) {
		// WAP for generating queue for price Collections
		// Then iterate over the price collection Queue.
		Queue<Integer> price=new ArrayDeque<Integer>();
		price.add(1);
		price.add(2);
		price.remove();
		for(Integer p:price)
		{
			System.out.println(p);
		}
	}

}
