package com.simplilearn.serialization.Items;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ItemDeserialization {
public void deserialization()
{
	try
	{
	FileInputStream f=new FileInputStream("File.ser");
	ObjectInputStream o=new ObjectInputStream(f);
	Items item=(Items)o.readObject();
	System.out.println(item);
	o.close();
	f.close();
	}
	catch(IOException f)
	{
		System.out.println(f);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
