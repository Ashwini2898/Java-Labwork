package Client;

import Server.LambdaExpression;

public class LambdaDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//LambdaExpression max=(num1,num2)->num1>num2?num1:num2;
		LambdaExpression power=(num1,num2)->{
			int product=1;
			for(int i=0;i<num2;i++)
			{
				product=product*num1;
			}
			return product;
		};
//int result=max.fun(10,20);
	int ans=power.power(2,2);
	System.out.println(ans);
	}

}
