package Variable_Declare;

import java.util.Scanner;

public class Pattern2 {
	
		public static void main(String[] args) 
		{
			Scanner ip=new Scanner(System.in);
			System.out.println("Enter a limit");
			int row=ip.nextInt();
			for(int i=row;i>1;i--)
			{
				
				
				{
					for(int j=1;j<row;j++)
					{
					System.out.println("");
					
						for(int k=5;k>1;k--)
						{
							System.out.print("*");
						}
					}
				}	
			}
			
		}
}
