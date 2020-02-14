package Variable_Declare;

class e 
{
	e()
	{
		int x=20;
		System.out.println("parent class"+x);
	}
	
}
class d extends e
	{
	d(int a)
	
	{
		//super();
		//int y=2;
		System.out.println("Child class"+a);
		
		
	}
	class f extends e
	{
		 f() 
		 
		 {
			 super();
			System.out.println("child class 2");
		}
	}

	}

public class SuperConstrTest2 {
	
	public static void main(String[] args) 
	{
		SuperConstrTest2 obj1=new SuperConstrTest2();
		
		e obj4=new d();
	}

	

}
