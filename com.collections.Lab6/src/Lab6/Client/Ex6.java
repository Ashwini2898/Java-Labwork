package Lab6.Client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer>voter=new HashMap<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of people");
int n=sc.nextInt();
System.out.println("Enter the id  :");
int id []=new int[n]; 
int age []=new int[n];
for(int i=0;i<n;i++)
{
	 id[i]=sc.nextInt();
	
}
System.out.println("Enter the age :");
for(int i=0;i<n;i++)
{
 age[i]=sc.nextInt();
	
}
for(int i=0;i<n;i++)
{
 voter.put(id[i], age[i]);
	
}
System.out.println(voter);
List<Integer>list=votersList(voter);

//for(int i : list)
//{
//System.out.println("valid person for voting:"+i);
//}
	}

	private static List<Integer> votersList(Map<Integer, Integer> check) {
		// TODO Auto-generated method stub
		List<Integer>vl=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer>entry:check.entrySet())
		{
		if(entry.getValue()>18)
		{
			int i=entry.getKey();
			vl.add(i);
		}
		}
		return vl;
	}
}
