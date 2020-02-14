package Variable_Declare;

import java.util.Scanner;

public class ReverseAnArray {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int i,a[]=new int[6];
		for(i=0;i<a.length;i++)
		{System.out.println("enter the element");
			a[i]=obj.nextInt();
			
		}
		
		for(i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		
		}
		System.out.println("the reverse of array is");
		for(i=a.length-1;i>=0;i--)
		{
			System.out.print(" "+a[i]);
		}
	}
	

}
