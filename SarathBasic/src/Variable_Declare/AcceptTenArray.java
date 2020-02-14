package Variable_Declare;

import java.util.Scanner;

public class AcceptTenArray {
	public static void main(String[] args) 
	{
		int a[]=new int [10];
		System.out.println("Enter 10 elements");
		Scanner ip=new Scanner(System.in);
		a[0]=ip.nextInt();
		a[1]=ip.nextInt();
		a[2]=ip.nextInt();
		a[3]=ip.nextInt();
		a[4]=ip.nextInt();
		a[5]=ip.nextInt();
		a[6]=ip.nextInt();
		a[7]=ip.nextInt();
		a[8]=ip.nextInt();
		a[9]=ip.nextInt();
		
		System.out.println("Entered Numbers are");
		for(int i=0;i<10;i++)
		System.out.println(a[i]);
	}

}
