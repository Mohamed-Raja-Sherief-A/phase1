package com.simplilearn.serialization.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppendDemo {

	public static void main(String[] args) {
		File file=new File("Sample.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			PrintWriter output=new PrintWriter(new FileWriter(file,true));
			output.println("Mohamed");
			output.println("Raja");
			output.println("Sherief");
			output.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
