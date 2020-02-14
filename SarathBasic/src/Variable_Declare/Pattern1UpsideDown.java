package Variable_Declare;

import java.util.Scanner;

	public class Pattern1UpsideDown {
		public static void main(String[] args) 
		{
			int row,i,j;
			Scanner ip=new Scanner(System.in);
			System.out.println("Enter No.of Rows");
			row=ip.nextInt();
			for(i=1;i<=row;i++)
			{
				System.out.println("");
				for(j=i;j<=row;j++)
				{
					System.out.print("*");
				}
			}
		}
	}


