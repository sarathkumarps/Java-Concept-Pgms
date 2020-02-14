package Variable_Declare;

import java.util.Scanner;

public class LargestInArray {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[]=new int[6];
		int i,large;
		for(i=0;i<a.length;i++)
			
		{
			System.out.println("enter the element");
			a[i]=obj.nextInt();
		
		}
		System.out.println("the array is");
		for(i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
			
		}
		large=a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i]>large)
{
				large=a[i];
}
			
		}
		System.out.println("the largest is"+" "+large);
	}

}
