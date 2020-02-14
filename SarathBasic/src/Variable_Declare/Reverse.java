package Variable_Declare;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] arg)
	{
		
		int temp;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=ip.nextInt();
		
		while(n>0)
		{
			temp=n%10;
			System.out.print(temp);
			n=n/10;
		
			
		}
		
		
	}

}
