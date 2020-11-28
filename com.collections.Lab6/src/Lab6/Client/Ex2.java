package Lab6.Client;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter theString:");
String a=sc.nextLine();

Integer count=1;
Map<Character,Integer>charList=new HashMap<>();
char[] Str=a.toCharArray();
for(char c:Str)
	{
	if(charList.containsKey(c))
		charList.put(c, count+1);
	else
		charList.put(c, 1);
}
for (Map.Entry entry : charList.entrySet()) 
{
	System.out.println(entry.getKey()+" "+entry.getValue());
}
}
}