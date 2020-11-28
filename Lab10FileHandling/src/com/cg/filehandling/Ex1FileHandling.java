package com.cg.filehandling;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Ex1FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
readfromFile("C:/Users/Microsoft/Desktop/capgpath.txt");
	}

	private static void readfromFile(String string) {
		// TODO Auto-generated method stub
		LineNumberReader lineno=null;
		try {
		 lineno=new LineNumberReader(new FileReader("C:/Users/Microsoft/Desktop/capgpath.txt"));
		 System.out.println("Line"+lineno.getLineNumber());
		 lineno.setLineNumber(1);
		 System.out.println("Line"+lineno.getLineNumber());
		 String line=null;
		 while((line=lineno.readLine())!=null)
		 {
			 System.out.println("Line"+lineno.getLineNumber()+":"+line);
		 }
	}catch(Exception e)
		{
		e.printStackTrace();
		}finally
		{
			try {
				if(lineno!=null) {
					lineno.close();
				}
			}catch(IOException e)
			{
		}

}
}
}
