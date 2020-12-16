package com.simplilearn.serialization.filehandling;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
		// WAP for deleting a file if exists.
		File file=new File("Sample.txt");
		if(file.exists())
		{
			if(file.delete())
			{
				System.out.println("File deleted");
			}
			else
			{
				System.out.println("Not deleted");
			}
		}
		else
		{
			System.out.println("File does not exist");
		}

	}

}
