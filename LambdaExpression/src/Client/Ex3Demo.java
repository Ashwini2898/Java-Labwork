package Client;
import Server.Ex3;
import java.util.Scanner;
public class Ex3Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
Ex3 credentials=(userId,password)->{
if (userId.equals("ashwini") && password.equals("ash789"))
return true;
else
return false;
	};
System.out.println("Enter the userid");

String id=sc.nextLine();
System.out.println("Enter password");
String pw=sc.nextLine();
boolean result=credentials.isValid( id, pw);
System.out.println(result);
	}
}
