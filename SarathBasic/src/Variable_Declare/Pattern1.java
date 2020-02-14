package Variable_Declare;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		int row,i,j;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter No.of Rows");
		row=ip.nextInt();
		for(i=1;i<=row;i++)
		{
			System.out.println("");
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		}
	}

}
