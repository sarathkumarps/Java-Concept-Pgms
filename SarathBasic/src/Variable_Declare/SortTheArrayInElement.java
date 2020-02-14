package Variable_Declare;

import java.util.Scanner;

public class SortTheArrayInElement {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[]=new int[6];
		int i,j,temp;
		for(i=0;i<a.length;i++)
	{System.out.println("enter the eelement");
			a[i]=obj.nextInt();
			
	}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(i=a.length;i>0;i++) {
			for(j=i+1;i<i;j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
		
	}


