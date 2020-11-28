package Lab6.Client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



public class Ex1Client {

	public static void main(String[] args) {
		
Map<Integer,String> nameList=new HashMap<>();
nameList.put(1,"Raj");
nameList.put(2,"Sam");
nameList.put(3,"Ram");
nameList.put(4,"Sonu");
nameList.put(5,"Suraj");
System.out.println(nameList);
List<String>output=getValue( nameList);
System.out.println(output);
	}
public static List<String>getValue(Map<Integer,String> nameList)
{
	Collection<String>values=nameList.values();
	ArrayList<String>listofvalues=new ArrayList<>(values);

	Collections.sort(listofvalues);
	

return listofvalues;
}
}