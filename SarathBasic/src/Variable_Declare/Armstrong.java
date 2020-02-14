package Variable_Declare;

import java.util.Scanner;

public class Armstrong {
	static public void main(String[] arg)
	{
		
		int temp=0;
		int pd=0;
		int sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER A NUMBER ");
		int n=obj.nextInt();
		int org=n;
		while(n>0)
		{
			temp=n%10;
			pd=pd+(temp*temp*temp);
			n=n/10;
			//System.out.println(n);
			
			
		}
		
		if(org==pd)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not An Armstrong");
		}
		
	}

}
