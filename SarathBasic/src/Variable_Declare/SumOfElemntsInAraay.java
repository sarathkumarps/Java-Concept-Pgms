package Variable_Declare;

import java.util.Scanner;

public class SumOfElemntsInAraay {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[]=new int[6];
		int i;
		int s=0;
		for(i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
			
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		System.out.println(" " +"sum="+s);
	}

}
