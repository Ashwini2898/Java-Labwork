package com.cg.filehandling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Ex2FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:/Users/Microsoft/Desktop/abc.pdf");
		if(f.exists())
		{
		System.out.println("File Exists  "+f.exists());
		
		}
		else
		{
			System.out.println(f+" Does not Exists");
		}
		if(f.exists())
		{
			if(f.canWrite())
			{
				System.out.println(f+"File is Writable");
			}
			else
			{
				System.out.println(f+"File is not Writable");
			}
			if(f.canRead())
			{
				System.out.println(f+"File is Readable");
			}
			else
			{
				System.out.println(f+"File is not Readable");
			}
			System.out.println("Size of File is  "+f.length()+" bytes");
		}
	}

}
