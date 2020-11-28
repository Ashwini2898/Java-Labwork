package Lab6.Client;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer>list=new HashMap<String,Integer>();
list.put("9980", 95);
list.put("9981", 80);
list.put("9982", 75);
list.put("9983", 88);
list.put("9984", 79);
System.out.println("student Details"+list);
Map<String,String>data=getStudents(list);
	
	}
	private static HashMap<String, String> getStudents(HashMap<String,Integer>list) {
		// TODO Auto-generated method stub
		HashMap<String,String>result=new HashMap<>();
		Set<String> str=list.keySet();
		Iterator<String>it=str.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			Integer marks=list.get(s);
			if(marks>=90)
			{
				System.out.println(s+"  Gold");
			}
				if(marks>=80 && marks<90)
				{
					System.out.println(s+"  Silver");
				}
				if(marks>=70 && marks<80)
				{
					System.out.println(s+"  Bronze");
				}
			}
		
		return result;
	}

}
