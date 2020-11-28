package Client;
import Server.Ex2;
import java.util.Scanner;
public class Ex2Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub

	System.out.println("Enter the string");
	String s=sc.nextLine();
	Ex2 space=(str)->str.replaceAll("", " ");
	System.out.println(space.addspace(s));

	
	}
}
