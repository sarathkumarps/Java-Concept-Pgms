package Variable_Declare;

import java.util.Scanner;

public class FloydTraingle {
	public static void main(String[] args) {
		int row,num=1;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Number of Row");
		row=ip.nextInt();
		
		int i,j;
		for (i=1;i<=row;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
