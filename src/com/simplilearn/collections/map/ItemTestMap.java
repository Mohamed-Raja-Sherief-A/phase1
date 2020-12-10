package com.simplilearn.collections.map;

public class ItemTestMap {
	private int barcode;
	private String name;
	private Double price;
	public ItemTestMap(int barcode, String name, Double price) {
	
		this.barcode = barcode;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ItemTestMap [barcode=" + barcode + ", name=" + name + ", price=" + price + "]";
	}
	


}
