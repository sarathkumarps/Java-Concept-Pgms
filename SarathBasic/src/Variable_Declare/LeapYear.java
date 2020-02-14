package Variable_Declare;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int n=0;
		boolean flag=false;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a Year	:");
		n=ip.nextInt();
		
		if(n%400==0)
		{
			flag=true;
		}
		else if(n%100==0)
		{
			flag=false;
		}
		else if(n%4==0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		if(flag==true)
		{
			System.out.println("Leap Year");
		}
		else if(flag==false)
		{
			System.out.println("Not Leap Year");
		}
	}

}
