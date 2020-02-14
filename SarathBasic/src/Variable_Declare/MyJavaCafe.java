package Variable_Declare;

import java.util.Scanner;

public class MyJavaCafe {
	
	int choice;
	float price;
	  int ship=0;
	
	
		public int shipping(int a,float b)
		{
			choice=a;
		price=b;
			
			if(choice==1)
			{
				ship=ship+5;
			}
			
			
			
			
			
			if(price<=10)
			{	
				ship=ship+2;
				
			}
			else
			{
				ship=ship+3;
			}
		
			return ship;
			
			
		}
		
		
		public static void main(String[] args) 
		{
			int choice=0;
			float  price=0f,total=0f;
			String item;
			System.out.println("Enter the item");
			Scanner ip1=new Scanner(System.in);
			item=ip1.next();
			System.out.println("Enter the Price");
			Scanner ip2=new Scanner(System.in);
			price=ip2.nextFloat();
			System.out.println("Over Night Delivery(0==no,1==yes)");
			Scanner ip3=new Scanner(System.in);
			choice=ip3.nextInt();
			
			MyJavaCafe ob=new MyJavaCafe();
			
			ob.shipping(choice,price );
			
			
			//int ship=ob.shipping();
			
			
			total=ob.price+ship;
			
			System.out.println("Invoice \t "+item+"  "+price+"\n Shipping  "+ship+"\n Total \t"+total);
				
		}

	}


