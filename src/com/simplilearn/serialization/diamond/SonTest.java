package com.simplilearn.serialization.diamond;
interface Mom {
	
	default void show() {
		System.out.println("Mom Here !");
	}
}

interface Dad {
	
	default void show() {
		System.out.println("Father Here !");
	}
}

public class SonTest implements Dad,Mom {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SonTest s=new SonTest();
		s.show();
	}
	public void show()
	{
	Dad.super.show();
	Mom.super.show();	
	}
}
