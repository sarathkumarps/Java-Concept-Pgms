package Variable_Declare;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] arg)
	{
		int n;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Limit");
		n=ip.nextInt();
		int n1=0,n2=1,n3,i;
		System.out.print(n1+" "+n2);
		for(i=2;i<n;i++)
		{
		n3=n1+n2;
		System.out.print(" "+n3+" " );
		n1=n2;
		n2=n3;		
		}
	}

}
