package Variable_Declare;

import java.util.Scanner;

public class AdditionOf2Arrays {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int a[]=new int[5];
	int i,s=0;
	int b[]=new int[5];
	for(i=0;i<a.length;i++)
	{System.out.println("enter element of a");
		a[i]=obj.nextInt();
		
	}
	System.out.println("array a is");
	for(i=0;i<a.length;i++)
	{
		System.out.println(" "+a[i]);
	}
	
	for(i=0;i<b.length;i++)
	{System.out.println("enter element of b");
		b[i]=obj.nextInt();
		
	}
	System.out.println("array b is");
	for(i=0;i<b.length;i++)
	{
		System.out.println(" "+b[i]);
	}
	for(i=0;i<a.length;i++)
	{
		s=s+a[i]+b[i];
		
	}
	System.out.println("sum="+s);
}
}
