package Variable_Declare;

import java.util.Scanner;

public class Prime {
	public static void main(String[] arg)
	{
		
		int m,n;
		
		int flag=0;
		Scanner obj1=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		n=obj1.nextInt();
		m=n/2;
		
		for(int i=2;i<m;i++)
		{
			if(n%i==0)
			{
				System.out.println("Number is Not Prime");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Number is Prime ");
		}
	}
	
}
