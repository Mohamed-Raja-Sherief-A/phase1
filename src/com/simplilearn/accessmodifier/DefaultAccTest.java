package com.simplilearn.accessmodifier;

public class DefaultAccTest {
	public static void main(String[] args) {
		DefaultExample de=new DefaultExample();
		System.out.println(de.Score);
		System.out.println(de.name);
		
	}
	
	

}
class DefaultExample extends Hero
{
	int Score=20;
	protected String name=power;
	
}
