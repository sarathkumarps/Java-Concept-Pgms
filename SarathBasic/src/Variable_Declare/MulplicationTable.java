package Variable_Declare;

import java.util.Scanner;

public class MulplicationTable {
	public static void main(String[] args) {
		int n,pr,i;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter The Number:");
		n=ip.nextInt();
		for(i=1;i<=10;i++)
		{
			pr=i*n;
			System.out.println(i+"*"+n+"="+pr);
		}
				
	}

}
