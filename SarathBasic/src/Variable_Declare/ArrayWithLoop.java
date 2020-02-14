package Variable_Declare;

import java.util.Scanner;

public class ArrayWithLoop {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int r=obj.nextInt();
		int i;
		int a[]=new int[5];
		for(i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
