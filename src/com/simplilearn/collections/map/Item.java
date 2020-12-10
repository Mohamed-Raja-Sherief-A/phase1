package com.simplilearn.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Item {

	public static void main(String[] args) {
		// WAP for Generating a Items based map with following fields
		// id, price, name,tag ,brocade.
		Map<Integer,ItemTestMap> items=new HashMap<Integer,ItemTestMap>();
		items.put(2, new ItemTestMap(2, "milk", 100d));
		items.put(1, new ItemTestMap(1, "buiscut", 100d));
		
		for(Map.Entry<Integer,ItemTestMap> entry : items.entrySet())
		{
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		

	}

}
