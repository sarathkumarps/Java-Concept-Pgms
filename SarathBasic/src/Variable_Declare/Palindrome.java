package Variable_Declare;

import java.util.Scanner;

public class Palindrome {
	
	
	public static  void main(String [] arg) 
	{
		int temp=0;
		int org;
		int pd=0;
		
		
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int n=obj.nextInt();
		org=n;
		while(n>0)
		{
			temp=n%10;
			
			pd=(pd*10)+temp;
			n=n/10;
			
		}
		if(org==pd)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not An Palindrome");
		}
	}
}
