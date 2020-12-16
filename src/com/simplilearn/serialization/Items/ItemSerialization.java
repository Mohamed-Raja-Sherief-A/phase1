package com.simplilearn.serialization.Items;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ItemSerialization {
 public void serilaization()
 {
	 Items item=new Items(1, "Buiscut");
	 try
	 {
	 FileOutputStream output=new FileOutputStream("File.ser");
	 ObjectOutputStream o=new ObjectOutputStream(output);
	 o.writeObject(item);
	 o.close();
	 output.close();
	 }
	 catch(IOException e)
	 {
		 System.out.println(e);
	 }
 }
}
