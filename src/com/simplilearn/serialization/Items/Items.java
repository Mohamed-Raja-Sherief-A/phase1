package com.simplilearn.serialization.Items;

import java.io.Serializable;

public class Items implements Serializable {
	// WAp for serialization and deserialization Of Items Object.
	// Items details  : id , name, description , createdDate, expireDate
	private int id;
	private String name;
	
	public Items(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + "]";
	}
	
	
}
