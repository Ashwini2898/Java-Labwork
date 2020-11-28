package Lab6.Client;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers in array");
Integer a[]=new Integer[5];
for(int i=0;i<5;i++)
{
	a[i]=sc.nextInt();
}
Map<Integer,Integer>array=getSquares(a);
Iterator<Integer>it=array.keySet().iterator();
while(it.hasNext())
{
	Integer key=it.next();
	System.out.println(key+": " +array.get(key));
	
}
	}

	private static Map<Integer, Integer> getSquares(Integer[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		// TODO Auto-generated method stub
		for(int j:a)
			map.put(j,j*j);
		return map;
	}

}
