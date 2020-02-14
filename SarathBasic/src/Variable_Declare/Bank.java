package Variable_Declare;

import java.util.Scanner;

public class Bank



	{
			
				void intrestrate()
				{
					System.out.println("16");
				}
	
	public static void main(String[] args) {
		
		System.out.println("Select Bank for Intrest \n 1.for Global\n 2. for HDFC \n 3.for ICIC \n 4.for SIB");
		Scanner ip=new Scanner(System.in);
		int choose=ip.nextInt();
		if(choose==1)
		{
			Bank obj1=new Bank();
			obj1.intrestrate();
		}
		
		if(choose==2)
		{
			Bank obj2=new Hdfc();
			obj2.intrestrate();
		}
		if(choose==3)
		{
			Bank obj3=new Icic();
			obj3.intrestrate();
		}
		if(choose==4)
		{
			Bank obj4=new Sib();
			obj4.intrestrate();
		}
	}

	}
class Hdfc extends Bank
	{
		void intrestrate()
		{
			System.out.println("15");
		}
	}
class Icic extends Bank
{
	void intrestrate()
	{
		System.out.println("10");
	}
}
class Sib extends Bank
{
	void intrestrate()
	{
		System.out.println("8");
	}
}


