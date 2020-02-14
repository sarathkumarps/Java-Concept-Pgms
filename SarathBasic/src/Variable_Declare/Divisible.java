package Variable_Declare;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] arg)
	{
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your Number = ");
		int a=obj.nextInt();
		if(a%2==0)
		{
			System.out.println("Divisible by 2");
			if(a%5==0)
			{
				System.out.println("Divisible By 5");
			}
			else 
			{
			 System.out.println("Not Divisible By 5 ");
			}
			
		}
		else 
		{
			System.out.println("Not divisible by 2");
		}
	}

}
