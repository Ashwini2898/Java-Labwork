package Lab6.Client;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
int[] number=new int[n];
System.out.println("Enter the numbers of array");
for(int i=0;i<n;i++)
{
	number[i]=sc.nextInt();

}

	
int output=getSecondSmallest(number);
	}


	private static int getSecondSmallest(int[]list) {
		// TODO Auto-generated method stub
	List<Integer> list1=new ArrayList<>();
	for(int i=0;i<list.length;i++)
	{
		list1.add(list[i]);
	}
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println((list1).get(1));
		return list1.get(1);
		
	}

	
	}
