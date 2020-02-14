package Variable_Declare;

import java.util.Scanner;

public class PrimeLimit {
	public static void main(String[] args) {
		
	
	int i,j,n;
	//int m;
	
	
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter Limit");
	n=ip.nextInt();
	//m=n/2;
	
	for(i=1;i<=n;i++)
	{
		int flag=0;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=1;
				
			}
		
				
		}
		if(flag==0)
		{
			System.out.println(i);
			
		}
	}
	
	
	
	}
}
	