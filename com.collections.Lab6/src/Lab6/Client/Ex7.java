package Lab6.Client;

import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer list[]=new Integer[4];
list[0]=50;
list[1]=122;
list[2]=203;
list[3]=450;


String [] reverseNumbers=new String[list.length];

for(int i=0;i<list.length;i++) {
	reverseNumbers[i]=list[i].toString();
	StringBuffer sb=new StringBuffer(reverseNumbers[i]);
	reverseNumbers[i]=sb.reverse().toString();
	list[i]=Integer.parseInt(reverseNumbers[i]);
	System.out.println(list[i]);

	
}
Arrays.sort(list);


	return;
	}

}
