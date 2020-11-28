package Client;
import java.util.Scanner;

import Server.Ex5;
public class Ex5Demo {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
Ex5 Factorial=(num)->{
int fact=1;
for ( int i=1;i<=num;i++)
{
	fact=fact*i;
}
return fact;
};
int result=Factorial.factorial(5);
System.out.println(result);
}
}